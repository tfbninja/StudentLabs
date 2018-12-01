package lab16c_arrayList_expression;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver {

    private String expression;
    private int solved;

    public ExpressionSolver(String s) {
        expression = s;
        solved = 0;
    }

    public void setExpression(String s) {
        expression = s;
        solved = 0;
    }

    public void solveExpression() {
        solved = 0;
        ArrayList<String> tokens = new ArrayList<>(Arrays.asList(expression.split(" ")));
        int total = 0;
        boolean mult;
        boolean plus;

        while (tokens.size() > 1) {
            for (int i = 0; i < tokens.size(); i++) {
                String token = tokens.get(i).trim();
                int temp;
                mult = tokens.toString().contains("*") || tokens.toString().contains("/");
                plus = tokens.toString().contains("+");
                //System.out.println("i: " + i + ", mult: " + mult + ", token: " + token + ", plus: " + plus);
                //System.out.println(tokens);

                try {
                    if (mult) {
                        if (token.equals("*")) {
                            temp = Integer.valueOf(tokens.get(i - 1)) * Integer.valueOf(tokens.get(i + 1));
                            tokens.set(i, String.valueOf(temp));
                            tokens.remove(i + 1);
                            tokens.remove(i - 1);
                        } else if (token.equals("/")) {
                            temp = Integer.valueOf(tokens.get(i - 1)) / Integer.valueOf(tokens.get(i + 1));
                            tokens.set(i, String.valueOf(temp));
                            tokens.remove(i + 1);
                            tokens.remove(i - 1);
                        }
                    } else {
                        if (token.equals("+")) {
                            temp = Integer.valueOf(tokens.get(i - 1)) + Integer.valueOf(tokens.get(i + 1));
                            tokens.set(i, String.valueOf(temp));
                            tokens.remove(i + 1);
                            tokens.remove(i - 1);
                        } else if (token.equals("-")) {
                            temp = Math.negateExact(Integer.valueOf(tokens.get(i + 1)));
                            tokens.set(i, String.valueOf(temp));
                            tokens.add(i, "+");
                            tokens.remove(i + 1);
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid expression: \"" + expression + "\"");
                }
            }
        }
        solved = Integer.valueOf(tokens.get(0));
    }

    public String toString() {
        return expression + " = " + solved;
    }
}

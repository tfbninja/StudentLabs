package lab16c_arrayList_expression;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner {

    public static void main(String args[]) {
        String[] tests = {"3 + 5", "3 * 5", "3 - 5", "3 / 5", "5 / 5 * 2 + 8 / 2 + 5", "5 * 5 + 2 / 2 - 8 + 5 * 5 – 2", "3 * 5"};
        ExpressionSolver calc = new ExpressionSolver("");
        for (String i : tests) {
            calc.setExpression(i);
            calc.solveExpression();
            System.out.println(i + "\n" + calc);
        }
    }
}

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
        String[] tokens = expression.split(" ");
        String newExpr = "";
    }

    public String toString() {
        return "";
    }
}

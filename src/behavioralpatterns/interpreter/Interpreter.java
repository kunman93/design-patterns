package behavioralpatterns.interpreter;

import behavioralpatterns.interpreter.expression.AndExpression;
import behavioralpatterns.interpreter.expression.Expression;
import behavioralpatterns.interpreter.expression.OrExpression;
import behavioralpatterns.interpreter.expression.TerminalExpression;

public class Interpreter {
    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}

package behavioralpatterns.interpreter;

import behavioralpatterns.interpreter.expression.Expression;

/**
 * In short, the pattern defines the grammar of a particular language in an object-oriented way which can be evaluated by the interpreter itself.
 *
 * We are going to create an interface Expression and concrete classes implementing the Expression interface.
 * A class TerminalExpression is defined which acts as a main interpreter of context in question.
 * Other classes OrExpression, AndExpression are used to create combination expressions.
 *
 * InterpreterPatternDemo, our demo class, will use Expression class to create rules and demonstrate parsing of expressions.
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Expression isMale = Interpreter.getMaleExpression();
        Expression isMarriedWoman = Interpreter.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Julie Married"));
    }
}
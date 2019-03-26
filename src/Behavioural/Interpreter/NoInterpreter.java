package Behavioural.Interpreter;

import java.util.Stack;

public class NoInterpreter {


    public static void main(String[] args) {

        // Client enters expressions that forms an AST with integers and operations:

        String expression = "8-7+9";
        // Here, check for invalid chars

        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();

        int evaluated = 0;


        // Chains of higher precedence (CHP) is any sequence of a String where
        // the left-most character is a numeric, the next character is * or /
        // AND the next character is numeric AND
        // if there are any proceeding characters, they will be pairs of: */operator and numeric operand.
        // -CHPs 3 characters or more.
        // -CHP size is always an odd number

        // Chain of ordinary precedence (COP) is any sequence of a String where
        // the left-most character is a numeric, the next character is - or +
        // AND the next character is numeric AND
        // if there are any proceeding characters, they will be pairs of: +-operator and numeric operand.
        // -CHPs 3 characters or more.
        // -CHP size is always an odd number


        // Extract CHPs
    }


}

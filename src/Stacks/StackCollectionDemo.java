package Stacks;
import java.util.Stack;

public class StackCollectionDemo {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        System.out.println(infixToPostfix("(a+b+c)/d"));
        //abcd^e-fgh*+^*+i-
        //abcd^e-fgh*+^*+i-
        //ABC+*D/
        //ABC+*D/
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<Character>();

        for (char c : exp.toCharArray()) {
            if (c!='+' && c!='-' && c!='*' && c!='/' && c!='(' && c!=')' && c!='^')
                result.append(c);
            else {
                if (operatorStack.empty())
                    operatorStack.push(c);
                else {
                    if (c == '(') {

                        operatorStack.push(c);

                    } else if (c == ')') {

                        while (operatorStack.peek() != '(') {
                            result.append(operatorStack.pop());
                        }
                        operatorStack.pop();

                    } else {
                        char o = operatorStack.peek();
                        if(getPrecedence(o)>=getPrecedence(c)){
                            emptyStackUntilRightOperatorOnTop(result,operatorStack);
                        }
                        operatorStack.push(c);
                    }

                }
            }
        }

        while(!operatorStack.empty()){
            result.append(operatorStack.pop());
        }

        return result.toString();
    }

    private static void emptyStackUntilRightOperatorOnTop(StringBuilder res, Stack<Character> operatorStack) {
        while(!operatorStack.empty()){
            if(operatorStack.peek() == '(')
                break;
            res.append(operatorStack.pop());
        }
    }

    private static int getPrecedence(char c){
        switch (c){
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            default:
                return 1;
        }
    }


}
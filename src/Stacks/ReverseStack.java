package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        System.out.println("Original Stack: "+s1);
        Stack<Integer> s_reversed = new Stack<>();
        reverseStackUsingRecursion(s1,s_reversed);
        System.out.println("Reversed Stack "+s_reversed);
    }

    static void reverseStackUsingRecursion(Stack<Integer> so, Stack<Integer> sn){
        if(so.empty())
            return;

        sn.push(so.pop());
        reverseStackUsingRecursion(so,sn);
    }
}

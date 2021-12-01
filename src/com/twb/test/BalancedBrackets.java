package com.twb.test;

import java.util.*;

public class BalancedBrackets {

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr){
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            String st = ""+ x;
            switch (st) {
                case ")":
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case "}":
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case "]":
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        // Check Empty Stack
        return (stack.isEmpty());
    }

    // function to check if brackets are balanced
    static boolean areBracketsBalancedOther(String expr){
        // Using ArrayDeque is faster than using Stack class
        List<Character> stack = new ArrayList<>();
        int index = 0;

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.add(x);
                index++;
                continue;
            }
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            if(index==0) return false;
            switch (x) {
                case ')':
                    check = stack.get(--index);
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.get(--index);
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.get(--index);
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
            stack.remove(index);
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
    // Driver code
    public static void main(String[] args) {
        String expr = "([{}]!ghs){";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

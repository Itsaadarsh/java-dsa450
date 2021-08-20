package StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        var op = ispar("[({[([{}])]})}");
        System.out.println(op);
    }

    static boolean ispar(String x) {
        var stack = new Stack<Character>();
        var left = Arrays.asList('(', '[', '{');
        var right = Arrays.asList(')', ']', '}');

        for (Character string : x.toCharArray()) {
            if (left.contains(string)) {
                stack.push(string);
            } else if (right.contains(string)) {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((top == '[' && string == ']') || (top == '(' && string == ')') || (top == '{' && string == '}')) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }

        return stack.isEmpty();

    }

}

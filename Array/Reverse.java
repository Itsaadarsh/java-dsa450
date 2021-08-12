package Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * Reverse an Array
 */
public class Reverse {

    public void reverseUsingStack(int[] input) {
        var stack = new Stack<Integer>();
        for (int item : input) {
            stack.push(item);
        }
        int count = 0;
        while (!stack.empty()) {
            input[count] = stack.pop();
            count++;
        }

    }

    public void reverseArray(int[] input) {
        int start = 0;
        int end = input.length - 1;
        int temp;
        while (start < end) {
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int list1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int list2[] = { 1, 2, 3, 4, 5 };
        var rev = new Reverse();
        rev.reverseUsingStack(list1);
        rev.reverseArray(list2);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }

}
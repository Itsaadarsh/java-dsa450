package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] list = { { 1, 3 }, { 2, 6 }, { 8, 10 } };

        var op = merge(list);
        for (int[] is : op) {
            System.out.println(Arrays.toString(is));
        }
    }

    static int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });

        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            var top = stack.peek();
            if (top[1] < intervals[i][0]) {
                stack.push(intervals[i]);
            } else if (top[1] < intervals[i][1]) {
                top[1] = intervals[i][1];
                stack.pop();
                stack.push(top);
            }
        }

        int[][] list = new int[stack.size()][2];
        stack.copyInto(list);

        return list;
    }
}

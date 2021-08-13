package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] list = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        var op = sort(list, list.length - 1);
        for (int i = 0; i < op.size(); i++) {
            list[i] = op.get(i);
        }
        System.out.println(Arrays.toString(list));
    }

    static ArrayList<Integer> sort(int[] array, int end) {
        var op = new ArrayList<Integer>();
        for (int i : array) {
            if (i == 0) {
                op.add(i);
            }
        }
        for (int i : array) {
            if (i == 1) {
                op.add(i);
            }
        }
        for (int i : array) {
            if (i == 2) {
                op.add(i);
            }
        }
        return op;
    }

}

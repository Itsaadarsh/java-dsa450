package Array;

import java.util.Arrays;

public class CycleRotation {
    public static void main(String[] args) {
        var list = new int[] { 9, 8, 7, 6, 4, 2, 1, 3 };
        rotate(list, list.length);
        System.out.println(Arrays.toString(list));
    }

    static void rotate(int[] list, int n) {
        int temp = list[n - 1];
        for (int i = n - 1; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = temp;
    }
}

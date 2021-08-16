package Array;

import java.util.Arrays;

public class NegBegPosEnd {
    public static void main(String[] args) {
        int[] list = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        rearrange(list);
        System.out.println(Arrays.toString(list));
    }

    static void rearrange(int[] input) {
        int j = 0;
        int temp;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                j++;
            }
        }
    }
}

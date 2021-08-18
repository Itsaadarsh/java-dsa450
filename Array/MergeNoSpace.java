package Array;

import java.util.Arrays;

public class MergeNoSpace {
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
        int arr2[] = new int[] { 2, 3, 8, 13 };
        merge(arr1, arr2, arr1.length, arr2.length);
    }

    static void merge(int arr1[], int arr2[], int n, int m) {
        for (int i = 0; i < arr2.length; i++) {
            int temp;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] < arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr2[i];
                    arr2[i] = temp;
                    Arrays.sort(arr2);
                }
            }
        }
    }
}
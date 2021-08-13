package Array;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] list = { 73, 188, 894, 915, 940, 616, 900, 548 };
        int k = 7;
        int output = kthSmallEle(list, 0, list.length - 1, k);
        System.out.println(output);
    }

    static int kthSmallEle(int[] array, int start, int end, int k) {
        sort(array, start, end, k);
        return array[k - 1];

    }

    static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int boundary = start - 1;

        for (int i = start; i <= end; i++) {
            if (input[i] <= pivot) {
                boundary++;
                swap(input, i, boundary);
            }
        }
        return boundary;
    }

    static void sort(int[] array, int start, int end, int k) {
        if (start >= end) {
            return;
        }

        var boundary = partition(array, start, end);
        sort(array, start, boundary - 1, k);
        sort(array, boundary + 1, end, k);
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

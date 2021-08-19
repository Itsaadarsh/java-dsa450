package Array;

public class CountInversion {
    public static void main(String[] args) {
        long[] list = new long[] { 2, 4, 1, 3, 5 };
        var op = inversionCount(list, list.length);
        System.out.println(op);
    }

    static long inversionCount(long arr[], long N) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

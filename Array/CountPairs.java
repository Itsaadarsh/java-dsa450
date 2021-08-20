package Array;

import java.util.HashMap;

public class CountPairs {
    public static void main(String[] args) {
        var list = new int[] { 1, 2, 5, 3, 6, 4, 6 };
        var op = getPairsCount(list, list.length, 5);
        System.out.println(op);
    }

    static int getPairsCount(int[] arr, int n, int k) {
        int count = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 0);

            }
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (hm.get(k - arr[i]) != null) {
                count += hm.get(k - arr[i]);
            }

            if (k - arr[i] == arr[i])
                count--;
        }

        return count / 2;

    }
}

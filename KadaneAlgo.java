public class KadaneAlgo {
    public static void main(String[] args) {
        var arr = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
        var op = maxSubarraySum(arr, arr.length);
        System.out.println(op);
    }

    static int maxSubarraySum(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}

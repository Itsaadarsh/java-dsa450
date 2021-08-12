package Array;

public class MinAndMax {

    static class Result {
        int min;
        int max;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        Result op = minmax(arr);
        System.out.println(op.min);
        System.out.println(op.max);
    }

    static Result minmax(int[] input) {
        var res = new Result();
        res.min = input[0];
        res.max = 0;
        for (int i : input) {
            if (i > res.max) {
                res.max = i;
            } else if (i < res.min) {
                res.min = i;
            }
        }
        return res;
    }
}

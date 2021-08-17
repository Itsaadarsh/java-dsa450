package Array;

public class MinJumps {
    public static void main(String[] args) {
        var list = new int[] { 6, 1, 9, 1, 1, 7, 9, 5, 2, 10 };
        var op = minJumps(list);
        System.out.println(op);
    }

    static int minJumps(int[] arr) {
        int value = arr[0];
        if (value == 0) {
            return -1;
        }
        int sum = value;
        int jump = 1;
        while (sum < arr.length - 1) {
            value = arr[sum];
            if (value == 0) {
                return -1;
            }
            sum += value;
            jump++;
        }
        return jump;

    }
}

// Recursive sol required
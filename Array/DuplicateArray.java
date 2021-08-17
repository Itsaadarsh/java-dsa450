package Array;

import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        var list = new int[] { 1, 3, 4, 2, 2 };
        var op = findDuplicate(list);
        System.out.println(op);
    }

    static int findDuplicate(int[] nums) {
        var set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        set.removeAll(set);
        return -1;
    }
}

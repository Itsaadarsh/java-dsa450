package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        var a = new int[] { 85, 25, 1, 32, 54, 6 };
        var b = new int[] { 85, 2 };
        var op = union(a, a.length, b, b.length);
        System.out.println(op);
    }

    static int union(int a[], int n, int b[], int m) {
        Set<Integer> listSet = new HashSet<Integer>();
        for (int aNum : a) {
            listSet.add(Integer.valueOf(aNum));
        }
        for (int bNum : b) {
            listSet.add(Integer.valueOf(bNum));
        }
        return listSet.size();
    }
}

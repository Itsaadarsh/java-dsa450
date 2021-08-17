package Array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        var a = new int[] { 1, 3, 2, 4, 8, 9, 0, 7, 7 };
        var b = new int[] { 1, 3, 7, 5, 4, 0, 7, 5 };
        var op = intersection(a, a.length, b, b.length);
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

    static int intersection(int a[], int n, int b[], int m) {
        Set<Integer> listSetA = new HashSet<Integer>();
        Set<Integer> listSetB = new HashSet<Integer>();
        for (int aNum : a) {
            listSetA.add(Integer.valueOf(aNum));
        }
        for (int bNum : b) {
            listSetB.add(Integer.valueOf(bNum));
        }
        listSetA.retainAll(listSetB);
        return listSetA.size();

    }
}

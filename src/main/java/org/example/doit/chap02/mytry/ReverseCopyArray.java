package org.example.doit.chap02.mytry;

import java.util.Arrays;

public class ReverseCopyArray {

    public static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            swap(b, i, b.length - i - 1);
        }

        copy(a, b);
    }

    public static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3};
        int[] a = new int[b.length];

        System.out.println("배열 b: " + Arrays.toString(b));
        System.out.println("배열 a: " + Arrays.toString(a));

        rcopy(a, b);

        System.out.println("배열 b: " + Arrays.toString(b));
        System.out.println("배열 a: " + Arrays.toString(a));
    }
}

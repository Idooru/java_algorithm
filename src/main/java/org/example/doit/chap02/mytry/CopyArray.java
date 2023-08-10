package org.example.doit.chap02.mytry;

import java.util.Arrays;

public class CopyArray {

    public static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3};
        int[] a = new int[b.length];

        copy(a, b);

        System.out.println("배열 b: " + Arrays.toString(b));
        System.out.println("배열 a: " + Arrays.toString(a));
    }
}

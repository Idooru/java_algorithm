package org.example.doit.chap02.mytry;

import java.util.Arrays;
import java.util.Random;

public class ReverseSort {

    public static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void whiteBox(int[] a) {
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < 3; i++) {
            int first = i, last = a.length - i - 1;
            System.out.printf("a[%d]과 a[%d]을 교환합니다.\n", first, last);
            swap(a, first, last);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순 정렬을 마쳤습니다.");

    }

    public static void main(String[] args) {
        whiteBox(new int[]{2, 5, 1, 3, 9, 6, 7});
    }
}

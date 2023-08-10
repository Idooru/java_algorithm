package org.example.doit.chap02.mytry;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static int[] reverse(int[] a) {
        int[] b = a.clone();

        for (int i = 0; i < b.length / 2; i++) {
            swap(b, i, b.length - i - 1);
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;

        do {
            System.out.print("요솟수: ");
            num = stdIn.nextInt();
        } while (num <= 0);

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d] = ", i);
            x[i] = stdIn.nextInt();
        }

        int[] y = reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.printf("y = %s", Arrays.toString(y));
    }
}

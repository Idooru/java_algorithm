package org.example.doit.chap02.mytry;

import org.example.doit.chap02.lib.Lib;

import java.util.Arrays;

public class AllSum {

    public static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] randomIntArray = Lib.getRandomIntArray(7, 10);
        System.out.println(Arrays.toString(randomIntArray));
        int result = sumOf(randomIntArray);
        System.out.println(result);
    }
}

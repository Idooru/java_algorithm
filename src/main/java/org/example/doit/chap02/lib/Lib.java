package org.example.doit.chap02.lib;

import java.util.Random;

public class Lib {
    public static int[] getRandomIntArray(int count, int bound) {
        Random random = new Random();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        return arr;
    }
}

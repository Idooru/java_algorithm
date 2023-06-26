package org.example.basic100.fibonacci;

import java.util.Arrays;

public class FibonacciClient {
    public static void main(String[] args) {
        final FibonacciClient fibonacciClient = new FibonacciClient();

        final int[] ints = fibonacciClient.makeFibonacciArray(12);
        System.out.println(Arrays.toString(ints));
    }

    public int[] makeFibonacciArray(int length) {
        final int[] ints = new int[length];

        ints[1] = 1;
        ints[2] = 1;

        for (int i = 3; i < length; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }

        return ints;
    }
}

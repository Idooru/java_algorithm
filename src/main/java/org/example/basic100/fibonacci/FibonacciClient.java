package org.example.basic100.fibonacci;

import java.util.Arrays;

public class FibonacciClient {
    public static void main(String[] args) {
        final FibonacciClient fibonacciClient = new FibonacciClient();

        final int[] ints = fibonacciClient.makeFibonacciArray(12);
        System.out.println(Arrays.toString(ints));

        fibonacciClient.implementFibonacciWithMethod(fibonacciClient);
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

    public void implementFibonacciWithMethod(FibonacciClient fibonacciClient) {
        final int fib = fibonacciClient.fib(10);
        System.out.println("fib = " + fib);
    }

    private int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

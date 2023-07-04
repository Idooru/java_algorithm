package org.example.doit.chap01.original;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n, w;

        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = scanner.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1)
                System.out.println();
        }

        if (n % w != 0) {
            System.out.println();
        }
    }
}

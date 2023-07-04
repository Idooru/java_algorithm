package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = 0, w = 0;

        do {
            System.out.print("n값 입력: ");
            n = scanner.nextInt();
            System.out.print("w값 입력: ");
            w = scanner.nextInt();
        } while (n <= 0 || w <= 0);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1) {
                System.out.println();
            }
        }

        if (n % w != 0) {
            System.out.println();
        }
    }
}

package org.example.doit.chap01.original;

import java.util.Scanner;

public class PrintStar2 {
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

        for (int i = 0; i < n / w; i++)
            System.out.print("*".repeat(w));

        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));

    }
}

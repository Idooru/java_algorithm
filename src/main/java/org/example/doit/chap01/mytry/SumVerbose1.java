package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, sum =0;

        do {
            System.out.print("양의 정수 n 입력: ");
            n = scanner.nextInt();
        } while(n <= 0);

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.printf("%d + ", i);
            } else {
                System.out.printf("%d = ", i);
            }

            sum += i;
        }

        System.out.println(sum);
    }
}

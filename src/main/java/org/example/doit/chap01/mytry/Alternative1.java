package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("양의 정수 n 입력: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }

    }
}

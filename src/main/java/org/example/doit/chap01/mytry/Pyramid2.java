package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드 모양을 숫자로 출력합니다.");

        do {
            System.out.print("몇 단 피라미드입니까?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        npira(n);
    }

    public static void npira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}

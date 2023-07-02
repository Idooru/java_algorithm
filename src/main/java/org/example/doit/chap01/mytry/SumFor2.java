package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.printf("n값 입력: ");
            n = scanner.nextInt();
        } while(n <= 0);

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
    }
}

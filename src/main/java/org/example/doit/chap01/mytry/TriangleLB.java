package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int max = 0;

        final Scanner scanner = new Scanner(System.in);
        System.out.println("정수 a의 값을 입력하세요.: ");
        a = scanner.nextInt();
        System.out.println("정수 b의 값을 입력하세요.: ");
        b = scanner.nextInt();
        System.out.println("정수 c의 값을 입력하세요.: ");
        c = scanner.nextInt();

        if (max < a) {
            max = a;
            if (max < b) {
                max = b;
                if (max < c) {
                    max = c;
                }
            }
        }

        System.out.println("max = " + max);
    }
}

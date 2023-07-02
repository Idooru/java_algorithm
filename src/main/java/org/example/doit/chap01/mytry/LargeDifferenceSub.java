package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class LargeDifferenceSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, sub;

        System.out.print("a값 입력: ");
        a = scanner.nextInt();

        do {  
            System.out.print("b값 입력: ");
            b = scanner.nextInt();

            if (a >= b) System.out.println("a보다 큰 값을 입력하세요!");
        } while(b <= a);

        sub = b - a ;
        System.out.printf("b - a는 %d입니다.", sub);
    }
}

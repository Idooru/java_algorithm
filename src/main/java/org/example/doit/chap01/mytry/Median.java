package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        final Scanner scanner = new Scanner(System.in);
        System.out.println("정수 a의 값을 입력하세요.: ");
        a = scanner.nextInt();
        System.out.println("정수 b의 값을 입력하세요.: ");
        b = scanner.nextInt();
        System.out.println("정수 c의 값을 입력하세요.: ");
        c = scanner.nextInt();
        
        median(a, b, c);
    }

    public static void median(int a, int b, int c) {
        int median = 0;

        if (a < b) {
           if (c < a) {
            median = a;
           } else if (b < c) {
            median = b;
           } else {
            median = c;
           }   
        } else if (a > b) {
            if (c < b) {
                median = b;
            } else if (c > a) {
                median = a;
            } else {
                median = c;
            }
        }
        
        System.out.println("median = " + median);
    }
}

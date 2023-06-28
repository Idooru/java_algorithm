package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 n 입력: ");
        int n = stdIn.nextInt();
        
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("sum = " + sum);
    }
}

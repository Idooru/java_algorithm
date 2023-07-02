package org.example.doit.chap01.mytry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        do {
           try {
                System.out.print("양의 정수 입력: ");
                n = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
                scanner.nextLine(); 
            }
        } while(n <= 0);

        String stringifyInt = Integer.toString(n);
        
        for (int i = 0; i <= stringifyInt.length(); i++) {
            if (i == stringifyInt.length()) {
                System.out.printf("그 수는 %d자리입니다.", i);
            }
        }
    }
}

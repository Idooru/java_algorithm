package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.printf("입력된 정수(%d)는 양수입니다.", num);
        } else if (num < 0) {
            System.out.printf("입력된 정수(%d)는 음수입니다.", num);
        } else {
            System.out.printf("입력된 정수(%d)는 %d입니다.", num, num);
        }
    }
}

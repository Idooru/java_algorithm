package org.example.doit.chap01.mytry;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        System.out.print("두 자리 양수를 입력하세요.");

        do {
            System.out.print("no값: ");
            no = scanner.nextInt();
        } while (no < 10 || no > 99);

        System.out.printf("변수 no값은 %d이 되었습니다.", no);
    }
}

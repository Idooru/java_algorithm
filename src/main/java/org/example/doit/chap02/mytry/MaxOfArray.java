package org.example.doit.chap02.mytry;

import java.util.Scanner;

public class MaxOfArray {

    public static int maxOf(int[] a) {
        int max = a[0];

        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no, i = 0;

        System.out.println("키의 최댓값을 구합니다.");

        do {
            System.out.print("사람 수: ");
            no = stdIn.nextInt();
        } while (no <= 0);

        int[] height = new int[no];

        while (i < no) {
            System.out.printf("%d번째 사람:", i + 1);
            int input = stdIn.nextInt();

            if (!(input > 100 && 210 > input)) {
                System.out.println("키가 사람키가 아닙니다.");
                continue;
            }

            height[i] = input;
            i++;
        }

        System.out.printf("제일 큰 키는 %d입니다.", maxOf(height));
    }
}

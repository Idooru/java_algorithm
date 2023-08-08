package org.example.doit.chap02.mytry;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    public static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("키의 최댓값을 구합니다.");

        do {
            System.out.print("사람 수: ");
            no = stdIn.nextInt();
        } while (no <= 0);

        int[] height = new int[no];

        for (int i = 0; i < no; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.printf("height[%d] = %d\n", i, height[i]);
        }

        System.out.printf("최댓값은 %d입니다.", maxOf(height));
    }
}

package org.example.doit.chap03.mytry;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] arr, int count, int key) {
        int i = 0;

        while (true) {
            if (i == count) {
                return -1;
            } else if (arr[i] == key) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int count = stdIn.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("arr[%d]: ", i);
            int num = stdIn.nextInt();
            arr[i] = num;
        }

        System.out.print("키: ");
        int key = stdIn.nextInt();

        int result = seqSearch(arr, count, key);

        if (result == -1) {
            System.out.println("값이 존재하지 않습니다.");
        } else {
            System.out.printf("검색한 값은 arr[%d]에 존재합니다.", result);
        }

    }
}

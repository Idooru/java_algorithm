package org.example.doit.chap03.mytry;

import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] arr, int count, int key) {
        int i = 0;
        arr[count] = key;

        while (true) {
            if (arr[i] == key) {
                break;
            }
            i++;
        }

        return i == count ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int count = stdIn.nextInt();

        int[] arr = new int[count + 1];

        for (int i = 0; i < count; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = stdIn.nextInt();
        }

        System.out.print("검색값: ");
        int key = stdIn.nextInt();

        int result = seqSearchSen(arr, count, key);

        if (result == -1) {
            System.out.println("찾으려는 값이 존재하지 않습니다.");
        } else {
            System.out.printf("찾으려는 값이 arr[%d]에 존재합니다.", result);
        }

    }
}

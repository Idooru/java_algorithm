package org.example.doit.chap03.mytry;

import java.util.Scanner;

public class SeqSearchSenFor {
    public static int seSearchSen(int[] arr, int count, int key) {
        arr[count] = key;
        int i;

        for (i = 0; i < count; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        return i == count ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int count = stdIn.nextInt();

        int[] arr = new int[count + 1];
        for (int i = 0; i < count; i++) {
            System.out.printf("x[%d]: ", i);
            arr[i] = stdIn.nextInt();
        }

        System.out.print("검색할 키: ");
        int key = stdIn.nextInt();

        int result = seSearchSen(arr, count, key);
        if (result == -1) {
            System.out.println("검색 실패");
        } else {
            System.out.printf("검색한 값이 x[%d]에 존재합니다.", result);
        }
    }
}

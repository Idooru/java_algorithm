package org.example.doit.chap03.mytry;

import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[] arr, int count, int key) {
        int pl = 0;
        int pr = count - 1;

        do {
            int pc = (pl + pr) / 2;
            if (arr[pc] == key) {
                return pc;
            } else if (arr[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수: ");

        int count = stdIn.nextInt();

        System.out.println("오름차순으로 정렬하기");
        int[] arr = new int[count];

        System.out.print("x[0]: ");
        arr[0] = stdIn.nextInt();

        for (int i = 1; i < count; i++) {
            do {
                System.out.printf("x[%d]: ", i);
                arr[i] = stdIn.nextInt();
            } while (arr[i] < arr[i - 1]);
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int idx = binSearch(arr, count, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.printf("검색한 값은 x[%d]에 존재합니다.", idx);
        }
    }
}

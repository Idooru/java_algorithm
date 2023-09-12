package org.example.doit.chap03.original;

import java.util.Scanner;

public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;     // 보초를 추가

        while (true) {
            if (a[i] == key) {      // 검색 성공
                break;
            }
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; // 1을 추가해 줘야지 보초를 추가할 때 예외가 발생되지 않는다.

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");    // 키값을 입력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.printf("그 값은 x[%d]에 있습니다.", idx);
        }
    }
}

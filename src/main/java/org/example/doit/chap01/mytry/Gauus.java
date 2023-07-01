package org.example.doit.chap01.mytry;

public class Gauus {

    static int a = 4;
    static int b = 6;
    static int[] swapArr;

    public static void main(String[] args) {
        if (a > b) {
          swapArr = swap(a, b);
          a = swapArr[0];
          b = swapArr[1];
        }

        int result = sumof(Gauus.a, Gauus.b);
        System.out.println(result);
    }

    static int sumof(int a, int b) {
        int first = a;
        int last = b;
        return (first + last) * (last - first + 1) / 2;
    }

    static int[] swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        int[] arr = new int[2];

        arr[0] = a;
        arr[1] = b;

        return arr; 
    }
}

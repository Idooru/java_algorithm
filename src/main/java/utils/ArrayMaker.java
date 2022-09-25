package utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayMaker {
    public static int[] getSequentialArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static int[] getSequentialArrayWithInput(int length) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[length];

        System.out.print("array[0] 입력: ");
        array[0] = sc.nextInt();

        for (int i = 1; i < array.length; i++) {
            while (true) {
                System.out.printf("array[%d] 입력: ", i);
                array[i] = sc.nextInt();
                if (array[i - 1] < array[i]) break;
            }
        }

        return array;
    }

    public static int[] getRandomArray(int length, int range) {
        Random rd = new Random();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(range);
        }

        Set<Integer> set = new HashSet<>();

        for (int i : array) {
            set.add(i);
        }

        if (set.size() != array.length) {
            set.add(rd.nextInt(range));
        }

        int[] newArray = new int[length];

        System.arraycopy(array, 0, newArray, 0, array.length);

        return newArray;
    }
}

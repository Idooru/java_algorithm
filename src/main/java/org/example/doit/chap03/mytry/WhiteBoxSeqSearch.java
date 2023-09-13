package org.example.doit.chap03.mytry;

public class WhiteBoxSeqSearch {
    public static int seqBinSearch(int[] arr, int count, int key) {
        int rowIndex;
        System.out.print("    | ");
        for (rowIndex = 0; rowIndex < count; rowIndex++) {
            System.out.printf(" %d  ", rowIndex);
        }
        System.out.println();
        System.out.print("----+-");
        int width = 2;

        for (rowIndex = 0; rowIndex < width * count; rowIndex++) {
            System.out.print("--");
        }

        System.out.print("\n    | ");

        System.out.print(" *");

        int columIndex = 0;

        while (true) {

            System.out.printf("\n   %d|", columIndex);
            for (int i = 0; i < count; i++) {
                System.out.printf("  %d ", arr[i]);
            }

            System.out.print("\n    |   ");

            if (arr[columIndex] == key) {
                return columIndex;
            } else if (arr[columIndex] == count) {
                return -1;
            }

            for (int i = 0; i < 2; i++) {
                System.out.print(" ");

            }

            columIndex++;
        }


    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 1, 9, 8};
        int count = arr.length;
        int result = seqBinSearch(arr, count, 10);
    }

}

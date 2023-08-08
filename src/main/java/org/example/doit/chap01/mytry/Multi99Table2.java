package org.example.doit.chap01.mytry;

public class Multi99Table2 {
    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();
        System.out.println("---+----------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}


package utils;

import java.util.Scanner;

public class Inputter {
    static Scanner sc = new Scanner(System.in);

    public static int inputToFind() {
        System.out.print("찾으려는 값을 입력하세요.: ");
        return sc.nextInt();
    }

    public static int inputToLength() {
        System.out.print("길이를 입력하세요.: ");
        return sc.nextInt();
    }

    public static int inputToRange() {
        System.out.print("범위를 입력하세요.: ");
        return sc.nextInt();
    }

}

package utils;

public class Result {
    public static void check(int result) {
        if (result == -1) {
            System.out.println("찾으려는 값은 존재하지 않습니다.");
        } else {
            System.out.printf("찾으려는 값은 numArray[%d]에 있습니다.\n", result);
        }
    }
}

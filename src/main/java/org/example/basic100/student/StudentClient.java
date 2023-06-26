package org.example.basic100.student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentClient {
    final ArrayList<Student> students = new ArrayList<>();
    String whatTry;

    public static void main(String[] args) {
        final StudentClient studentClient = new StudentClient();
        label:
        while (true) {
            final Scanner choiceScanner = new Scanner(System.in);
            System.out.print("어떤것을 시도합니까?: ");
            final String whichOne = choiceScanner.next();

            switch (whichOne) {
                case "add":
                    studentClient.addStudent();
                    break;
                case "find":
                    studentClient.findStudent();
                    break;
                case "exit":
                    break label;
                default:
                    System.out.println("기능이 없습니다.");
                    break;
            }
        }
    }

    public void findStudent() {
        whatTry = "검색";

        while (true) {
            final String yesOrNo = getTryScanner(whatTry);

            if (yesOrNo.equals("n")) {
                break;
            } else if (yesOrNo.equals("y")) {
                while (true) {
                    final Scanner getScanner = new Scanner(System.in);
                    System.out.printf("학생 이름 %s: ", whatTry);
                    String getStudentName = getScanner.next();

                    boolean flag = false;
                    for (Student student : students) {
                        if (student.name().equals(getStudentName)) {
                            System.out.println("학생 학번 = " + student.no());
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("존재하지 않은 학생이름입니다.");
                    }

                    break;
                }
            } else {
                System.out.println("y 혹은 n만 입력 가능합니다.");
            }
        }
    }

    public void addStudent() {
        whatTry = "추가";

        while (true) {
            final String yesOrNo = getTryScanner(whatTry);

            if (yesOrNo.equals("n")) {
                break;
            } else if (yesOrNo.equals("y")) {
                final Scanner addScanner = new Scanner(System.in);
                System.out.printf("학생 이름 %s: ", whatTry);
                String addStudentName = addScanner.next();

                int addStudentNo = 0;

                System.out.printf("학생 번호 %s: ", whatTry);
                try {
                    addStudentNo = addScanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("학생 번호는 정수만 입력 가능합니다.");
                    e.printStackTrace();
                }

                if (addStudentName.equals("n")) {
                    break;
                } else {
                    students.add(new Student(addStudentName, addStudentNo));
                }
            }
        }
    }

    public String getTryScanner(String whatTry) {
        final Scanner tryScanner = new Scanner(System.in);
        System.out.printf("%s을(를) 시도합니까?: ", whatTry);
        return tryScanner.next();
    }

}

package Unit9;

import java.util.Scanner;

public class Ex5_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many students are there?");

        int studentNum = Integer.parseInt(input.nextLine());

        String studentName1 = "";
        String studentName2 = "";

        int grade1 = 0;
        int grade2 = 0;

        while (studentNum > 0){

            System.out.println("Enter the name and grade, separated by a space.");

            String name = input.next();
            int grade = input.nextInt();

            if (grade > grade1){

                grade2 = grade1;
                grade1 = grade;

                studentName2 = studentName1;
                studentName1 = name;

            }

            else if (grade > grade2){

                grade2 = grade;
                studentName2 = name;

            }

            --studentNum;

        }

        System.out.printf("\n2 Highest Grades:\n%s : %d\n%s : %d", studentName1, grade1, studentName2, grade2);

    }
}
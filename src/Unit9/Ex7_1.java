package Unit9;

import java.util.Scanner;

public class Ex7_1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentNum = input.nextInt();

        System.out.printf("Enter %d scores, separated by spaces: ", studentNum);
        int[] studentGrades = new int[studentNum];
        int highestGrade = -1;

        for (int i = 0; i < studentGrades.length; i++){

            studentGrades[i] = input.nextInt();

        }

        for (int num : studentGrades){

            if (num > highestGrade){

                highestGrade = num;

            }
        }

        for (int i = 0; i < studentGrades.length; i++){

            if (studentGrades[i] >= highestGrade - 10){

                System.out.printf("Student %d score is %d and grade is A\n", i, studentGrades[i]);

            }

            else if (studentGrades[i] >= highestGrade - 20){

                System.out.printf("Student %d score is %d and grade is B\n", i, studentGrades[i]);

            }

            else if (studentGrades[i] >= highestGrade - 30){

                System.out.printf("Student %d score is %d and grade is C\n", i, studentGrades[i]);

            }

            else if (studentGrades[i] >= highestGrade - 40){

                System.out.printf("Student %d score is %d and grade is D\n", i, studentGrades[i]);

            }

            else {

                System.out.printf("Student %d score is %d and grade is F\n", i, studentGrades[i]);

            }
        }
    }
}


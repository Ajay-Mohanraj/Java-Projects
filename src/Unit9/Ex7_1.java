package Unit9;

import java.util.Scanner;
public class Ex7_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentNum = input.nextInt();

        System.out.printf("Enter %d scores, separated by spaces\n", studentNum);
        int[] studentGrades = new int[studentNum];
        int highestGrade = -1;

        for (int i = 0; i < studentGrades.length; i++){

            studentGrades[i] = input.nextInt();

        }
        for (int num : studentGrades){

        }


    }
}


package unit9.labs;

import java.util.Scanner;

public class Ex7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 10 integers you would like to see the reverse order of: ");
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++){

            nums[i] = input.nextInt();

        }

        for (int i = nums.length - 1; i >= 0; i--){

            System.out.printf("%d ", nums[i]);

        }
    }
}
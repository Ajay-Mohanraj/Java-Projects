package unit9.lessons;

import java.util.Scanner;


public class Day09_AboveAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = input.nextInt();

        int[] nums = new int[n];

        double sum = 0;

        System.out.println("Enter the numbers!");
        for (int i = 0; i < nums.length; i++){

            nums[i] = input.nextInt();
            sum += nums[i];

        }
        double avg = sum / nums.length;

        int above = 0;
        int below = 0;
        int equal = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > avg){
                above++;
            }
            else if (nums[i] == avg){
                equal++;
            }
            else{
                below++;
            }
        }
        System.out.printf("Above: %d, Below: %d; Equal: %d", above, below, equal);
    }
}

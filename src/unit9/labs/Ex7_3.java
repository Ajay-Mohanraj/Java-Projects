package unit9.labs;

import java.util.Scanner;

public class Ex7_3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");

        int num = -1;
        int[] quantity = new int[101];

        while (num != 0){

            num = input.nextInt();
            quantity[num]++;

        }

        for (int i = 0; i <= 100; i++){

            if (quantity[i] > 0){

                String output = i + " occurs " + quantity[i];
                output += quantity[i] > 1 ? " times" : " time";
                System.out.println(output);

            }
        }
    }
}
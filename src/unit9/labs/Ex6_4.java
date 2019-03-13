package unit9.labs;

import java.util.Scanner;

public class Ex6_4 {

    public static void reverse(int num){

        String reverseDigits = "";

        while (num > 0){

            reverseDigits += (num % 10);
            num /= 10;

        }

        System.out.println(reverseDigits);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you would like to reverse: ");
        int num = input.nextInt();

        reverse(num);

    }
}


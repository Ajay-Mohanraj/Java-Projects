package unit9.labs;

import java.util.Scanner;

public class Ex6_2 {

    public static long sumDigits(long n){

        int sum = 0;

        while (n > 0){

            sum += n % 10;
            n = n / 10;

        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to calculate the sum of its digits");
        long user = input.nextLong();

        long value = sumDigits(user);

        System.out.println(value);

    }
}

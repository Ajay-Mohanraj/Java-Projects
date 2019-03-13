package unit9.labs;

import java.util.Scanner;


public class Ex7_14 {
    public static int gcd(int... numbers){


        int gcd = 1;

        for (int i = 1; i <= numbers[0] && i <= numbers[1] && i <= numbers[2] && i <= numbers[3] && i <= numbers[4]; i++){
            if (numbers[0] % i == 0 && numbers[1] % i == 0 && numbers[2] % i == 0 && numbers[3] % i == 0 && numbers[4] % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        System.out.println(gcd(a, b, c, d, e));
    }
}



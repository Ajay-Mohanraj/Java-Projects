package unit8.labs;

import java.util.Scanner;

public class Lab8_1_Car_Rental {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is the name of the first company?");
        String name1 = in.nextLine();

        System.out.println("What is the price to rent the vehicle per day?");
        double rentPrice1 = Double.parseDouble(in.nextLine());

        System.out.println("What is the price per mile?");
        double milePrice1 = Double.parseDouble(in.nextLine());

        System.out.println("\nWhat is the name of the second company?");
        String name2 = in.nextLine();

        System.out.println("What is the price to rent the vehicle per day?");
        double rentPrice2 = Double.parseDouble(in.nextLine());

        System.out.println("What is the price per mile?");
        double milePrice2 = Double.parseDouble(in.nextLine());

        System.out.println("How many miles do you plan to drive?");
        double miles = Double.parseDouble(in.nextLine());

        double rate1 = (milePrice1 * miles) + rentPrice1;
        double rate2 = (milePrice2 * miles) + rentPrice2;

        System.out.printf("\n%s will cost $%.2f .\n", name1, rate1);
        System.out.printf("%s will cost $%.2f .\n", name2, rate2);

        if (rate1 < rate2) {

            System.out.printf("\n%s is cheaper.", name1);
        }
        else if (rate2 < rate1) {

            System.out.printf("\n%s is cheaper.", name2);
        }

        else {

            System.out.println("\nPick your poison!\n");
        }
    }
}

package unit8.labs;

import java.util.Scanner;

public class Lab8_2_Electronic_Piggy_Bank{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How much money is the piggy bank so far?");

        double balance = Double.parseDouble(input.nextLine());

        System.out.println("\nMenu:\n" +
                "(p) - Deposit a penny.\n" +
                "(n) - Deposit a nickel.\n" +
                "(d) - Deposit a dime.\n" +
                "(q) - Deposit a quarter.\n" +
                "(e) - Exit program.\n" +
                "Please press a letter to select an option:");

        String choice = input.nextLine();

        while (! choice.equals("e")){

            String request = "\nPlease press a letter to select an option:";

            switch(choice){

                case "p":

                    balance += 0.01;

                    System.out.printf("\nNew balance: $%.2f", balance);
                    System.out.println(request);

                    choice = input.nextLine();

                    break;

                case "n":

                    balance += 0.05;

                    System.out.printf("\nNew balance: $%.2f", balance);
                    System.out.println(request);

                    choice = input.nextLine();

                    break;

                case "d":

                    balance += 0.10;

                    System.out.printf("\nNew balance: $%.2f", balance);
                    System.out.println(request);

                    choice = input.nextLine();

                    break;

                case "q":

                    balance += 0.25;

                    System.out.printf("\nNew balance: $%.2f", balance);
                    System.out.println(request);

                    choice = input.nextLine();

                    break;


                default:

                    System.out.println("\nInvalid option.");
                    System.out.println(request);

                    choice = input.nextLine();

                    break;

            }
        }

                System.out.printf("\nFinal balance: $%.2f", balance);
                System.out.println("\n\tThank you.");

    }
}
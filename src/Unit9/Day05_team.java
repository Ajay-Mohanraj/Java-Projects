package Unit9;

import java.util.Scanner;

public class Day05_team {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Fav team?");
        String team = in.nextLine();

        if (team.equals("Giants")) {

            System.out.println("Yea");

        }

        else if ("GianTs".equalsIgnoreCase(team)){

            System.out.println("Boo");

        }

        else {

            System.out.println("Ok");

        }
    }
}

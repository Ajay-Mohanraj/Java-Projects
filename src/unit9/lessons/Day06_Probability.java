package unit9.lessons;

public class Day06_Probability {

    public static void main(String[] args) {

        int n = 0;
        int total = 0;

        while (n < 100){

            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;

            if (die1 + die2 == 12){

                total += 1;

            }

            n++;

            System.out.println((die1 + die2 == 12) ? "Yay" : "Nope");

        }
    }
}

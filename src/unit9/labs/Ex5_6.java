package unit9.labs;

public class Ex5_6 {

    public static void main(String[] args) {

        System.out.printf("%5s %16s   |   %5s %16s", "Miles", "Kilometers", "Kilometers", "Miles\n");

        int m = 1;

        for (int k = 20; k <= 65; k += 5){

            System.out.printf("%-5d %11.3f        |   %-5d %21.3f\n", m, (m * 1.609), k, (k / 1.609));

            m++;

        }
    }
}

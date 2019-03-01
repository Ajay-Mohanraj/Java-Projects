package Unit9;

public class Ex5_3 {

    public static void main(String[] args) {

        System.out.printf("%5s %16s", "Miles", "Kilometers\n");

        for (int i = 1; i <= 199; i+=2) {

            System.out.printf("%-5d %15.1f\n", i, i * 2.2);

        }
    }
}

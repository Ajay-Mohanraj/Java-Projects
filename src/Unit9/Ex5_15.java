package Unit9;

public class Ex5_15 {

    public static void main(String[] args) {

        int count10 = 0;

        for (int i = 33; i <= 126; i++){

            System.out.printf("%c ", i);

            count10++;

            if (count10 % 10 == 0){

                System.out.println();

            }
        }
    }
}
package unit9.labs;

public class Ex5_11 {

    public static void main(String[] args) {

        int count10 = 0;

        for (int i = 100; i <= 200; i++){

            if ((i % 5 == 0) ^ (i % 6 == 0)){

                System.out.printf("%d ", i);
                count10++;

                if (count10 % 10 == 0){

                    System.out.println();

                }
            }
        }
    }
}

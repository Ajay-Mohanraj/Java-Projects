package Unit9;

public class Ex6_12 {

    public static void printChars(char ch1, char ch2, int numberPerLine){

        int count = 0;

        for (int i = (ch1 + 1); i < ch2; i++){

            System.out.printf("%c ", i);

            ++count;

            if (count % numberPerLine == 0){

                System.out.println();

            }
        }
    }

    public static void main(String[] args) {

        printChars('1', 'z', 10);

    }
}

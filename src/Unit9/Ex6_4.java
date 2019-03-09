package Unit9;

public class Ex6_4 {

    public static void reverse(int num){

        String reverseDigits = "";

        while (num > 0){

            reverseDigits += (num % 10);
            num /= 10;

        }

        System.out.println(reverseDigits);

    }

    public static void main(String[] args) {

        reverse(123);

    }
}


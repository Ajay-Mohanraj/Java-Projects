package Unit8;

import java.util.Scanner;

public class firstCharacter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type your string");
        String s = in.nextLine();

        char c = s.charAt(0);

        if (c >= 'A' && c <= 'Z'){
            System.out.println("Capital");

        }
        else if (c >= 'a' && c <= 'z'){

            System.out.println("Lower!");

        }
        else {
            System.out.println("Other");
        }
        int a = (int)(Math.random() * 100);
        while (true){
            System.out.println(a);
            a = (int)(Math.random() * 100);
        }


    }
}

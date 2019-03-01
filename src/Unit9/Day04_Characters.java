package Unit9;

public class Day04_Characters {
    public static void main (String [] args){
        char myChar = 'G';
        System.out.printf("%x; %d, %c\n", (int)myChar, (int)myChar, myChar);
        myChar += 2;
        System.out.printf("%x; %d, %c\n", (int)myChar, (int)myChar, myChar);
        while (myChar < 25000){
            System.out.printf("%x; %d, %c\n", (int)myChar, (int)myChar, myChar);
            myChar += 1;
        }
    }
}

package unit9.lessons;

public class Day06_Switch {

    public static void main(String[] args) {

        int n = (int)(Math.random() * 4);

        System.out.println(n);

        switch(n){

            case 0:

                System.out.println("Sunny");
                break;

            case 1:

                System.out.println("Rainy");
                break;

            default:

                System.out.println("Snow");
                break;

        }
    }
}

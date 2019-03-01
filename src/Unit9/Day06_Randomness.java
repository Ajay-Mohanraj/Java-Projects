package Unit9;

public class Day06_Randomness {
    public static void main(String[] args) {
        int i = 0;
        while (i < 15) {
            int n = (int)(Math.random() * 6 - 1) * 2 - 1;
            System.out.println(n);
            i++;
        }
    }
}

package Unit9;

public class Day10_Frequency {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i <= 500000; i++){
            int num = (int)(Math.random() * 10);
            counts[num]++;
        }
        for (int i = 0; i <= 9; i++){
            System.out.printf("%d: %d\n", i, counts[i]);
        }
    }
}

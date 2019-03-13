package unit9.lessons;
import java.util.Scanner;


public class Day09_Distinct {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int count = 0;
        System.out.println("Enter 10 numbers to find how many distinct values there are.");

        for (int i = 0; i < 10; i++){

            int num = input.nextInt();

            boolean inList = false;
            for (int j = 0; j < count; j++){
                if(num == a[j]){
                    inList = true;
                    break;
                }
            }
            if (!inList){
                a[count++] = num;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.print(a[i] + " ");
        }
    }
}

package unit9.lessons;
import java.util.*;

public class Day14_Sorting {
    public static int[] getNewArray (int size) {
        int[] a = new int[size];
        Random rand = new Random(3);
        for (int i=0; i<size; i++) {
            a[i] = rand.nextInt(100);
        }
        return a;
    }
    public static void selectionSort(int[] a) {
        for (int i=0; i<a.length; i++) {
            int pos = i;
            for (int j=i+1;j<a.length; j++) {
                if (a[j] < a[pos]) {
                    pos = j;
                }
            }
            int temp  = a[i];
            a[i] = a[pos];
            a[pos] = temp;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void insertionSort(int[] a) {
        for (int i=1; i < a.length; i++) {
            int num = a[i];

            int j = i - 1;
            while ( j >= 0 && a[j] > num ) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = num;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = getNewArray(10);
        System.out.println(Arrays.toString(a));

        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
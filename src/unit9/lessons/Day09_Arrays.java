package unit9.lessons;

public class Day09_Arrays {
    public static void main(String[] args) {

        int[] a = new int[15];
        int[] b = {14, 19, 25, 29};

        System.out.println(a.length);
        System.out.println(b.length);

        a[3] = 12;
        a[4]= 19;
        a[5] = a[3] + a[4];

        for (int i = 0; i < a.length; i++){
            System.out.println(i + ": " + a[i]);
        }

    }
}

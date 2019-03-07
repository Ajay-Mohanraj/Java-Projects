package Unit9;

public class Day08_Recursive {
    public static int f(int x){
        if (x == 1){
            return 6;
        }
        else{
            return f(x-1) + 2 * x - 3;
        }
    }
    public static int g(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else{
            return g(n -1) + g(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(5));
        for (int n = 1; n < 10; n++){
            System.out.printf("%8d%8d%8d\n", n, f(n), g(n));
        }
    }
}

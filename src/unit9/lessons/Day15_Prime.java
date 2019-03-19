package unit9.lessons;

public class Day15_Prime {
    public static void main(String[] args) {
        boolean[] primes = new boolean[100];
        for (int i = 0; i < primes.length; i++){
            primes[i] = true;
        }
        for (int i = 2; i < primes.length; i++){
            for (int j = i * 2; j < primes.length; j += i){
                primes[j] = false;
            }
        }
        System.out.println("The primes are ");
        int count = 0;
        for (int i = 2; i < primes.length; i++){
            if (primes[i]){
                System.out.print(i + " ");
                count++;

                if (count == 10){
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}

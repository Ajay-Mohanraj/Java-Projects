package unit9.labs;

public class Ex6_8 {

    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;

    }

    public static double fahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9) * (fahrenheit - 32);

    }

    public static void main(String[] args) {

        System.out.printf("%13s %13s %5c %13s %14s", "Celsius", "Fahrenheit", '|', "Fahrenheit", "Celsius\n");

        double c = 40;

        for (double f = 120; f >= 30; f -= 10){

            System.out.printf("%13.1f %13.1f %5c %13.1f %13.2f\n", c, celsiusToFahrenheit(c), '|', f, fahrenheitToCelsius(f));

            c--;

        }
    }
}

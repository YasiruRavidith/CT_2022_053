package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        Temperature temperature = new Temperature(inputCelsius);
        double fahrenheit = temperature.toFahrenheit();

        System.out.printf("%.2f C = %.2f F%n", temperature.toCelsius(), fahrenheit);

        scanner.close();
    }
}

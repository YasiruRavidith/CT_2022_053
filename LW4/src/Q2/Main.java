package Q2;

import Q1.Temperature;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Temperature temperature = new Temperature();
        temperature.setFahrenheit(inputFahrenheit);

        System.out.printf("%.2f F = %.2f C%n", inputFahrenheit, temperature.toCelsius());

        scanner.close();
    }
}

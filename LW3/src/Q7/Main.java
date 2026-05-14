package Q7;

import java.util.Scanner;

public class Main {
    public static int countDigits(int number) {
        int value = Math.abs(number);
        if (value == 0) {
            return 1;
        }

        int digits = 0;
        while (value > 0) {
            digits++;
            value /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Program stopped.");
                break;
            }

            System.out.println("Number of digits: " + countDigits(number));
        }
    }
}

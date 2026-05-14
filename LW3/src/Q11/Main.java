package Q11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;

        System.out.println("I generated a number between 1 and 100.");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Higher");
            } else if (guess > target) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }
    }
}

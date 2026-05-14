package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

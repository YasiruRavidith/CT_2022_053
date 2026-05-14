package Q12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String pattern = "\\b" + Pattern.quote(oldWord) + "\\b";
        String result = sentence.replaceAll(pattern, Matcher.quoteReplacement(newWord));

        System.out.println("Updated sentence: " + result);
    }
}


import java.util.Scanner;

public class code7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        scanner.close();
        String[] words = sentence.split("[\\s,;.:!?]+");

        String longestWord = "";
        for (String word : words) {

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        if (longestWord.isEmpty()) {
            System.out.println("No valid words were found.");
        } else {
            System.out.println("\nThe longest word is: " + longestWord);
        }
    }
}

import java.util.Scanner;

public class BoxWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scan.nextLine();
        input = input.toUpperCase();

        // Convert input to an array of chars
        char[] word = input.toCharArray();

        // If length of the input is greater than 1 print the word normally
        if (input.length() > 1) {
            for (char i : word) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Print the next letter of the word normally
        for (int k = 1; k < input.length() - 1; k++) {
            System.out.print(word[k]);
            // Add spaces in between the words
            for (int l = 0; l < input.length() - 2; l++) {
                System.out.print(" ");
            }
            // Print the next letter of the word in reverse
            System.out.println(word[word.length - k - 1]);
        }

        // Print the word backwards
        for (int a = 0; a < input.length(); a++) {
            System.out.print(word[word.length - a - 1]);
        }
        System.out.println();
    }
}

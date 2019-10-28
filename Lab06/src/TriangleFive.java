import java.util.Scanner;

public class TriangleFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char character = scan.next().charAt(0);
        System.out.println("Enter a digit: ");
        int number = scan.nextInt();

        triangle_five(Character.toLowerCase(character), number);
    }

    public static void triangle_five(char ch, int num) {
        // Initialize Variables
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int c = ch-97;
        int count = num + 1;
        int count2 = num;

        // Begin Nested Loops
        for (int i = 0; i < num; i++) { // Controls the rows
            for (int j = 0; j < count2; j++) { // Controls the columns
                System.out.print(" ");
                count--;

                for (int k = 0; k < count; k++) { // Controls how many letters to print
                    if (c == 26) {
                        c = 0;
                    }
                    System.out.print(alphabet[c]);
                }
                c++;
            }
            count2--;
            count = num + 1;
            c = ch-97;
            System.out.println();
        }
    }
}

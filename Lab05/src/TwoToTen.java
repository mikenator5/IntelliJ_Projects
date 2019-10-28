import java.util.Scanner;

public class TwoToTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        long bin = scan.nextLong();
        long num;
        int fin = 0;
        int base = 1;

        for (int i = String.valueOf(bin).length() - 1; i >= 0; i--) {
            num = (bin % 10);
            bin /= 10;
            if (num == 1) {
                fin = fin + base;
            }

            base = base * 2;
        }
        System.out.println("Binary to Decimal: " + fin);
    }
}

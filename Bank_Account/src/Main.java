import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    double account;

    public static void main(String[] args) throws FileNotFoundException {
        String file = "bank.txt";
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money is in your account?");
        double initialBankAmount = scan.nextDouble();

        bank bankAccount = new bank(file);
        bankAccount.read_bank(file);
        Main bank = new Main(initialBankAmount);

        String input = "";
        while (!input.equals("end")) {
            System.out.println("Do you want to deposit or withdraw? ");
            input = scan.next();
            scan.nextLine();

            if (input.equalsIgnoreCase("deposit")) {
                System.out.println("How much do you want to deposit? ");
                double num = scan.nextDouble();
                bank.deposit(num);
                bankAccount.write_bank(file, num, true);
            }

            if (input.equalsIgnoreCase("withdraw")) {
                System.out.println("How much do you want to withdraw? ");
                double num = scan.nextDouble();
                bank.withdraw(num);
                bankAccount.write_bank(file, num, false);
            }

        }
        bankAccount.read_bank(file);
        System.out.println("Have a good day");
        scan.close();
    }

    public Main(double amount) {
        account = amount;
        System.out.println(account);
    }

    public void deposit(double depo) {
        account += depo;
        System.out.println(account);
    }

    public void withdraw(double with) {
        account -= with;
        System.out.println(account);
    }
}
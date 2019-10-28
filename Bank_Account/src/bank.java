import java.io.*;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

    }

    public bank(String file) {
        System.out.println("In Bank Now");
        File f = new File(file);
        if (!f.exists()) {
            try {
                PrintWriter writer = new PrintWriter(file, "UTF-8");
                writer.write("Initial");
                writer.close();
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public void read_bank(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner sc = new Scanner(f);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

    }

    public void write_bank(String file, double amount, boolean isDeposit) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (isDeposit == true) {
                bw.write("\nDeposited " + amount + ".");
            } else {
                bw.write("\nWithdrew " + amount + ".");
            }

            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

import java.util.Scanner;

public class Triangle {
    private double perimeter;
    private double s;
    private double area;

    private Triangle(double a, double b, double c) {
        perimeter = a + b + c;
        s = perimeter / 2;
        area = Math.sqrt( (s * (s - a) * (s - b) * (s-c)) );
        System.out.println("Sides: " + a + " " + b + " " + c);
        System.out.println("Area: " +  String.format("%.3f", area));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double a = scan.nextDouble();
        System.out.println("Enter side b: ");
        double b = scan.nextDouble();
        System.out.println("Enter side c: ");
        double c = scan.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
    }
}

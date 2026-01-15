import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a = -0.5;
        double b = 1.7;
        double t = 0.44;

        double x = Math.exp(-b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
        double y = b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;

        System.out.printf("x = %.5f%n", x);
        System.out.printf("y = %.5f%n", y);
    }
}
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();

        double f_x;

        if (x > -2 && x < 10) {
            f_x = Math.sqrt(b * x + 3);
        } else if (x == 10) {
            f_x = Math.abs(Math.pow(x, 2) - a * b * x + 7);
        } else if (x > 10) {
            f_x = Math.cos(x - 1);
        } else {
            return;
        }

        System.out.printf("f(x) = %.5f%n", f_x);
        
        scanner.close();
    }
}
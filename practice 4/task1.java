import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть a, b та x: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        double f;

        if (x >= 1 && x < 3) {
            f = 9 / (a * x);
        } else if (x == 3) {
            f = a * Math.pow(x, 2) + x + b;
        } else {
            System.out.println("x поза межами визначення функції");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}

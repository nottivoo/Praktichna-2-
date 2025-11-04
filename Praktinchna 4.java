import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b = sc.nextDouble();
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();

        double f;
        if (x >= 1 && x < 3) {
            f = 9 / (a * x);
        } else if (x == 3) {
            f = a * Math.pow(x, 2) + x + b;
        } else {
            f = Double.NaN;
        }
        System.out.println("f(x) = " + f);

        System.out.print("Введіть ціле число: ");
        int number = sc.nextInt();
        int reversed = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.printf("Реверс числа (while): %010d\n", reversed);

        temp = number;
        reversed = 0;
        do {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        } while (temp != 0);
        System.out.printf("Реверс числа (do-while): %010d\n", reversed);

        System.out.print("Введіть початок діапазону: ");
        int start = sc.nextInt();
        System.out.print("Введіть кінець діапазону: ");
        int end = sc.nextInt();
        System.out.print("Введіть просте число (1-9): ");
        int prime = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % prime == 0) continue;
            System.out.print(i + " ");
        }

        sc.close();
    }
}

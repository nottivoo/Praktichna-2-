import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = num;

        // Цикл while
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        System.out.printf("Реверс (while): %010d\n", reversed);

        // Цикл do-while
        temp = num;
        reversed = 0;
        do {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        } while (temp != 0);

        System.out.printf("Реверс (do-while): %010d\n", reversed);
    }
}

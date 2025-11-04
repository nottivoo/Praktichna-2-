import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть початок діапазону: ");
        int start = sc.nextInt();

        System.out.print("Введіть кінець діапазону: ");
        int end = sc.nextInt();

        System.out.print("Введіть просте число (1-9): ");
        int simple = sc.nextInt();

        System.out.println("Результат:");

        for (int i = start; i <= end; i++) {
            if (i % simple == 0) continue;
            System.out.print(i + " ");
        }
    }
}

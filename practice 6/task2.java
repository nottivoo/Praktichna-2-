import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = sc.nextInt();

        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
            sum += angles[i];
        }

        int requiredSum = 180 * (n - 2);

        if (sum == requiredSum) {
            System.out.println("Багатокутник може існувати (сума кутів правильна).");
        } else {
            System.out.println("Багатокутник НЕ може існувати. Сума кутів має бути: " + requiredSum);
        }

        sc.close();
    }
}

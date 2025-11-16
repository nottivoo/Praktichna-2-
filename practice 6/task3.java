import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введіть розмір масиву: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Згенерований масив:");
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nВведіть значення, яке потрібно знайти: ");
        int target = sc.nextInt();

        System.out.print("Введіть нове значення: ");
        int replacement = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
                found = true;
            }
        }

        System.out.println("\nРезультат:");
        for (int value : arr)
            System.out.print(value + " ");

        if (!found)
            System.out.println("\nЗначення не знайдено у масиві.");

        sc.close();
    }
}

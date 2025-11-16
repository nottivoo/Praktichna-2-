import java.util.Random;
import java.util.Scanner;

public class task5 {
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

        System.out.print("\nПеревірити на (1 - зростання, 2 - спадання): ");
        int mode = sc.nextInt();

        boolean isOrdered = true;

        if (mode == 1) { // зростання
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println(isOrdered ? "Масив зростає" : "Масив НЕ зростає");

        } else if (mode == 2) { // спадання
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println(isOrdered ? "Масив спадає" : "Масив НЕ спадає");

        } else {
            System.out.println("Невірний режим перевірки.");
        }

        sc.close();
    }
}

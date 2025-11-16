
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int size = 20; // Розмір масиву можна змінити
        int[] arr = new int[size];
        Random rnd = new Random();

        System.out.println("Згенерований масив:");
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(100); // числа від 0 до 99
            System.out.print(arr[i] + " ");
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int value : arr) {
            if (value % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println();
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Кількість непарних: " + oddCount);
    }
}

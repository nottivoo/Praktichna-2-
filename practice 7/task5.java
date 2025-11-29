import java.util.Random;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rand.nextInt(100);

        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];

        System.out.println();

        for (int[] row : t) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

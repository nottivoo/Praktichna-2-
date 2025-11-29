import java.util.Scanner;
import java.util.Random;

public class MinorOfMatrix {

    public static double[][] minor(double[][] m, int row, int col) {
        double[][] r = new double[m.length - 1][m.length - 1];
        int rr = 0;
        for (int i = 0; i < m.length; i++) {
            if (i == row) continue;
            int cc = 0;
            for (int j = 0; j < m.length; j++) {
                if (j == col) continue;
                r[rr][cc++] = m[i][j];
            }
            rr++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = sc.nextInt();
        double[][] m = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rand.nextInt(100);

        for (double[] row : m) {
            for (double val : row) System.out.print(val + " ");
            System.out.println();
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        double[][] minor = minor(m, r, c);

        for (double[] row : minor) {
            for (double val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

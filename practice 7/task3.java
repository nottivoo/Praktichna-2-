import java.util.Scanner;

public class Determinant5x5 {

    public static double determinant(double[][] m) {
        if (m.length == 1) return m[0][0];
        double det = 0;
        for (int col = 0; col < m.length; col++)
            det += Math.pow(-1, col) * m[0][col] * determinant(minor(m, 0, col));
        return det;
    }

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
        double[][] matrix = new double[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matrix[i][j] = sc.nextDouble();

        System.out.println(determinant(matrix));
    }
}

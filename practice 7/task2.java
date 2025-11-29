import java.util.Random;

public class SqrtOnOddIndices {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] arr = new double[4][5];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = rand.nextDouble(100);

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (i % 2 != 0 || j % 2 != 0)
                    arr[i][j] = Math.sqrt(arr[i][j]);

        for (double[] row : arr) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }
}

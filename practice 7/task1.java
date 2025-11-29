public class PyramidArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        for (int[] row : arr) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int num : arr[i]) System.out.print(num + " ");
            System.out.println();
        }
    }
}

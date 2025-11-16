public class task4 {
    public static void main(String[] args) {
        final int START = 0;
        final int END = 90;
        final int VALUES_PER_LINE = 10;

        System.out.println("Таблиця значень sin(x) від 0 до 90 градусів:");

        int counter = 0;

        for (int degree = START; degree <= END; degree++) {
            double radians = Math.toRadians(degree);
            double sinValue = Math.sin(radians);

            System.out.printf("%6.3f ", sinValue);
            counter++;

            if (counter == VALUES_PER_LINE) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

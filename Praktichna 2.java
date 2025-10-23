import java.util.Scanner;

public class DataTypesDemo {
    public static void main(String[] args) {
        
        System.out.println("=== Інформація про примітивні типи даних ===");
        System.out.println("byte:    " + Byte.BYTES + " байт, min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
        System.out.println("short:   " + Short.BYTES + " байт, min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
        System.out.println("int:     " + Integer.BYTES + " байт, min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
        System.out.println("long:    " + Long.BYTES + " байт, min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
        System.out.println("float:   " + Float.BYTES + " байт, min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
        System.out.println("double:  " + Double.BYTES + " байт, min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
        System.out.println("char:    " + Character.BYTES + " байт, min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: розмір залежить від JVM (true/false)");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ціле число (int): ");
            String intStr = scanner.nextLine();
            int intValue = Integer.parseInt(intStr);
            System.out.println("Ви ввели int: " + intValue);

            System.out.print("Введіть число з плаваючою крапкою (double): ");
            String doubleStr = scanner.nextLine();
            double doubleValue = Double.parseDouble(doubleStr);
            System.out.println("Ви ввели double: " + doubleValue);

            System.out.print("Введіть символ (char): ");
            String charStr = scanner.nextLine();
            char charValue = charStr.charAt(0);
            System.out.println("Ви ввели char: " + charValue);

            System.out.print("Введіть true або false (boolean): ");
            String boolStr = scanner.nextLine();
            boolean boolValue = Boolean.parseBoolean(boolStr);
            System.out.println("Ви ввели boolean: " + boolValue);

        } catch (Exception e) {
            System.out.println("Помилка введення! " + e.getMessage());
        }

        scanner.close();
    }
}

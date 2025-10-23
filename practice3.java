import java.util.Scanner;

public class practice3.java{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть рядок: ");
        String stringValue = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("\n--- Форматований вивід ---");

        System.out.println("1. Конкатенація: " + intValue + ", " + doubleValue + ", " + stringValue + ", " + boolValue);
        System.out.printf("2. printf (десятковий): Ціле: %d, Дійсне: %.2f, Рядок: %s, Логічне: %b%n", intValue, doubleValue, stringValue, boolValue);
        System.out.printf("3. printf (шістнадцятковий): %x%n", intValue);
        System.out.printf("4. printf (вісімковий): %o%n", intValue);
        System.out.printf("5. Рядок (праве вирівнювання, ширина 20): %20s%n", stringValue);
        System.out.printf("6. Рядок (ліве вирівнювання, ширина 20): %-20s%n", stringValue);
        String formattedDouble = String.format("7. String.format: %.3f", doubleValue);
        System.out.println(formattedDouble);
        String formattedBool = String.format("8. Логічне (upper case): %S", boolValue);
        System.out.println(formattedBool);
        String shortString = stringValue.length() > 5 ? stringValue.substring(0, 5) : stringValue;
        System.out.println("9. Скорочений рядок: " + shortString);
        System.out.printf("10. Комбінований: %d (%x), %.1f, \"%10s\", %b%n", intValue, intValue, doubleValue, stringValue, boolValue);
    }
}
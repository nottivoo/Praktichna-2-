import java.util.Scanner;

public class StringAdvancedTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = getUserInput();

        System.out.println("\nОберіть функцію:");
        System.out.println("2 - Повний реверс рядка");
        System.out.println("3 - Реверс кожного слова (порядок слів не змінюється)");
        System.out.print("Ваш вибір: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 2) {
            System.out.println("Результат: " + reverseString(input));
        } else if (choice == 3) {
            System.out.println("Результат: " + reverseWordsOnly(input));
        } else {
            System.out.println("Помилка: невірний вибір.");
        }
    }

    public static String getUserInput() {
        while (true) {
            System.out.println("Введіть рядок (мінімум 2 слова, кожне від 3 символів):");
            String input = scanner.nextLine().trim();
            String[] words = input.split("\\s+");

            if (words.length >= 2) {
                boolean isValid = true;
                for (String word : words) {
                    if (word.length() < 3) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) return input;
            }
            System.out.println("Рядок не відповідає критеріям. Спробуйте ще раз.");
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseWordsOnly(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
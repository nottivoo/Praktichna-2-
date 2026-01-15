import java.util.Scanner;

public class CamelCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split("[-_]");
        StringBuilder result = new StringBuilder(parts[0].toLowerCase());

        for (int i = 1; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                result.append(parts[i].substring(0, 1).toUpperCase());
                result.append(parts[i].substring(1).toLowerCase());
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}
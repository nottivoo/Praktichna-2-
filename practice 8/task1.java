import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        
        if (clean.equals(reversed)) {
            System.out.println("Рядок є паліндромом");
        } else {
            System.out.println("Рядок не є паліндромом");
        }
        scanner.close();
    }
}
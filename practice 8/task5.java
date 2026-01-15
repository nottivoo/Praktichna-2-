import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] forbiddenWords = {"нецензурне1", "нецензурне2"};
        String replacement = "[цензура]";
        
        String input = scanner.nextLine();
        String result = input;

        for (String word : forbiddenWords) {
            result = result.replaceAll("(?i)" + word, replacement);
        }

        System.out.println(result);
        scanner.close();
    }
}
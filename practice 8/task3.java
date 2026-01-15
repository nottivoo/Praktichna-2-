import java.util.Scanner;

public class WordLengthAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] words = input.trim().split("\\s+");
        if (words.length == 0 || input.isEmpty()) return;

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Найкоротше: " + shortest + " (" + shortest.length() + ")");
        System.out.println("Найдовше: " + longest + " (" + longest.length() + ")");
        scanner.close();
    }
}
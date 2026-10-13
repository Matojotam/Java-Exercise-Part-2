package se.lexicon;
import java.util.Scanner;
public class WordCounter {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        IO.print("Enter word to find: ");
        String find = scanner.nextLine();

        String findWord = find.toLowerCase();
        String lowerSentence = sentence.toLowerCase();
        String[] words = lowerSentence.trim().split("\\s+");

        int wordCount = 0;
        int matchCount = 0;

        for (String word : words) {
            wordCount++;

            if (word.equals(findWord)) {
                matchCount++;
            }
        }
        IO.println("Total words: " + wordCount);
        IO.println(find + " appears: " + matchCount + " times");
    }
}

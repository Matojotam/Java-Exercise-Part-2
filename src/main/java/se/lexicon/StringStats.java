package se.lexicon;
import java.util.Scanner;
public class StringStats {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a sentence: ");
        StringBuilder sentence = new StringBuilder(scanner.nextLine());

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = Character.toLowerCase(sentence.charAt(i));
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c >= 'a' && c <= 'z'){
                consonants++;
            } else if (c == ' ') {
                spaces++;
            }
        }

        IO.println("Vowels: " + vowels);
        IO.println("Consonants: " + consonants);
        IO.println("Digits: " + digits);
        IO.println("Spaces: " + spaces);

    }
}

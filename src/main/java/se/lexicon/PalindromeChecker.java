package se.lexicon;
import java.util.Scanner;
public class PalindromeChecker {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a word: ");
        StringBuilder palindrome = new StringBuilder(scanner.nextLine());
        StringBuilder reversed = new StringBuilder(palindrome).reverse();

        if (palindrome.toString().equalsIgnoreCase(reversed.toString())) {
            IO.println(palindrome + " is a palindrome.");
        } else {
            IO.println(palindrome + " is NOT a palindrome.");
        }

    }
}

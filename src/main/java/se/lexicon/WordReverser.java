package se.lexicon;

import java.util.Scanner;

public class WordReverser {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a word: ");
        String word = scanner.nextLine();


        IO.println("Word: " + word);
        IO.println("Reversed: " + new StringBuilder(word).reverse());
    }
}

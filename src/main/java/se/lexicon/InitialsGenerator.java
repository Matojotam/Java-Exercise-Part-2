package se.lexicon;
import java.util.Scanner;
public class InitialsGenerator {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter full name:");
        StringBuilder fullName = new StringBuilder(scanner.nextLine());

        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            if (i == 0 || fullName.charAt(i - 1) == ' ') {
                initials.append(Character.toUpperCase(c)).append('.');
            }
        }
        IO.println(initials);
    }
}

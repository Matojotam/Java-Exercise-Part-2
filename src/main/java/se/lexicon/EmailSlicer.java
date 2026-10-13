package se.lexicon;
import java.util.Scanner;
public class EmailSlicer {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter email: ");
        String email = scanner.nextLine();

        int atIndex = email.indexOf("@");

        String user = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        IO.println("Username: " + user);
        IO.println("Domain: " + domain);

    }
}

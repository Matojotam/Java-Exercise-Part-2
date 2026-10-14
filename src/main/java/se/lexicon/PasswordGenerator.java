package se.lexicon;

import java.util.Scanner;

public class PasswordGenerator {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter password length: ");
        int length = scanner.nextInt();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            char randomChar = characters.charAt(index);
            password.append(randomChar);

        }
        IO.println("Generated password: " + password);

    }
}

package se.lexicon;

import java.util.Scanner;

public class NumberCruncher {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter first number: ");
        int a = scanner.nextInt();
        IO.print("Enter second number: ");
        int b = scanner.nextInt();
        IO.print("Enter third number: ");
        int c = scanner.nextInt();

        int max = findMax(a, b, c);
        int min = findMin(a, b, c);
        double avg = average(a, b, c);
        IO.println("Maximum : " + max);
        IO.println("Minimum : " + min);
        IO.println("Average : " + avg);

    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}

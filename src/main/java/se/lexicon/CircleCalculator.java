package se.lexicon;

import java.util.Scanner;

public class CircleCalculator {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        IO.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = pi * radius;
        double circumference = 2 * pi * radius;
        IO.println("Area: " + String.format("%.2f", area));
        IO.println("Circumference: " + String.format("%.2f", circumference));
    }
}

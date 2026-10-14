package se.lexicon;

import java.util.Scanner;

public class PowerTable {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter base: ");
        double base = scanner.nextDouble();
        for (int i = 1; i <= 10;  i++){
            double power = (int) Math.pow(base, i);
            IO.println(base + "^" + i + " = " + power);

        }
        scanner.close();

    }
}

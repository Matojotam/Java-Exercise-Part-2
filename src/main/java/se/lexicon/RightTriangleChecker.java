package se.lexicon;

import java.util.Scanner;

public class RightTriangleChecker {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter side a: ");
        double sideA = scanner.nextDouble();
        IO.print("Enter side b: ");
        double sideB = scanner.nextDouble();
        IO.print("Enter side c: ");
        double sideC = scanner.nextDouble();

        double longestSide = Math.max(sideA, Math.max(sideB, sideC));
        IO.println("Longest side: " + longestSide);

        double otherSidesSquared =
                sideA * sideA + sideB * sideB + sideC * sideC
                        - longestSide * longestSide;

        boolean isRightTriangle =
                Math.abs(otherSidesSquared - longestSide * longestSide) < 0.000001;
        if (isRightTriangle){
            IO.println("This IS a right triangle.");
        }
        else IO.println("This is NOT a right triangle.");
        }


    }


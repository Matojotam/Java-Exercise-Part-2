package se.lexicon;
import java.util.Random;
import java.util.Scanner;

public class DiceStatistics {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        IO.print("How many rolls? ");
        int rolls = scanner.nextInt();
        Random random = new Random();

        for (int i = 0; i < rolls; i++){
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int total = die1 + die1;
            if (die1 == die2){
                IO.println("Roll " + i +": " + die1 + " + " + die2 + " = " + total + " DOUBLE!" );
            }
            else IO.println("Roll " + i + ": " + die1 + " + " + die2 + " = " + total);
        }
    }
}

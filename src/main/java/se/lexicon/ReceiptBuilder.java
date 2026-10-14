package se.lexicon;

import java.util.Scanner;

public class ReceiptBuilder {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder receipt = new StringBuilder();
        double grandTotal = 0;

        while (true) {
            IO.print("Enter item name (or 'done' to finish): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("done")) {
                break;
            }

            IO.print("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());

            receipt.append(item)
                    .append(" - ")
                    .append(String.format("%.2f", price))
                    .append("\n");

            grandTotal += price;
        }
        IO.println("\n===== RECEIPT =====");
        IO.print(receipt);
        IO.println("-------------------");
        IO.println("Grand total: " + String.format("%.2f", grandTotal));

        scanner.close();
    }

}
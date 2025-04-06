import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define categories
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Health care", "Vacations"};
        double totalExpenses = 0;

        // Prompt user for expenses in each category
        for (String category : categories) {
            System.out.print("Enter your monthly expense for " + category + ": $");
            totalExpenses += input.nextDouble();
        }

        // Calculate FairTax based on 23% consumption tax rate
        double fairTax = totalExpenses * 0.23;
        System.out.println("\nYour estimated FairTax payment: $" + fairTax);

    }
}
Ex.4.31

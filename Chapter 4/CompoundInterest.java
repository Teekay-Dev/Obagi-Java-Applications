public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        int years = 10;            // number of years

        System.out.printf("%-10s%-10s%-20s%n", "Rate", "Year", "Amount on deposit");

        // Loop through interest rates from 5% to 10%
        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0;

            // Compute amount for each year
            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%-10d%-10d$%,20.2f%n", rate, year, amount);
            }

            System.out.println(); // blank line between different rates
        }
    }
}
Ex.4.14
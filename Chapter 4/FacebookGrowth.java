import java.util.Scanner;

public class FacebookGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Constants
        double initialUsers = 1_000_000_000; // 1 billion users
        double growthRate = 0.04; // 4% per month
        double targetUsers1 = 1_500_000_000; // 1.5 billion users
        double targetUsers2 = 2_000_000_000; // 2 billion users

        // Calculate months required using logarithmic formula
        int monthsTo1_5B = (int) Math.ceil(Math.log(targetUsers1 / initialUsers) / Math.log(1 + growthRate));
        int monthsTo2B = (int) Math.ceil(Math.log(targetUsers2 / initialUsers) / Math.log(1 + growthRate));

        // Display results
        System.out.println("Months required for Facebook to reach 1.5 billion users: " + monthsTo1_5B);
        System.out.println("Months required for Facebook to reach 2 billion users: " + monthsTo2B);

        
    }
}
Ex.4.32
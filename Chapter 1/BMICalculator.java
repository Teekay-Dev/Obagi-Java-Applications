
// BMICalculator.java
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi < 24.9)
            System.out.println("Category: Normal weight");
        else if (bmi < 29.9)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");
        
        input.close();
    }
}
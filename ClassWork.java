//Write a Java method to find the Largest number among 3 number
//Write a java method to count all vowels in a string
//Write a method to calculate the area of a triangle
import java.util.Scanner;

public class ClassWork {
    
    // Method to find the maximum of three numbers
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
    
    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(int base, int height) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("========================================================================================%n");
        System.out.printf("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.printf("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.printf("Enter the third number: ");
        int number3 = input.nextInt();

        // Calling the method to find the maximum number
        int maxNumber = findMax(number1, number2, number3);
        System.out.printf("The maximum number is %d%n", maxNumber);

        System.out.printf("========================================================================================%n");
        
        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();
        
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();
        
        // Calling the method to calculate the triangle area
        double areaOfTriangle = calculateTriangleArea(base, height);
        System.out.printf("The area of the triangle is %.1f%n", areaOfTriangle);

        input.close(); // Closing scanner
    }
}
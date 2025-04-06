import java.util.Scanner;
public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int count = input.nextInt();
        
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a value: ");
            int value = input.nextInt();
            if (value < smallest) smallest = value;
        }
        
        System.out.println("Smallest value is: " + smallest);
        input.close();
    }
}
Exercise 4.11
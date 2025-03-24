import java.util.Scanner;


public class CreatingVariables{
	public static void main(String[] args){
     // a) Declare variables c, thisIsAVariable, q76354 and number to be of type int.
int c, thisIsAVariable, q76354;

// b) Prompt the user to enter an integer.
	System.out.print("Enter an integer:");

// c) Input an integer and assign the result to int variable value. Assume Scanner variable input can be used.
Scanner input = new Scanner(System.in);
int value = input.nextInt();

// d) Print "This is a Java program" on one line in the command window.
System.out.println("This is a Java program");

// e) Print "This is a Java program" on two lines in the command window. The first line should end with Java.
System.out.printf("This is a Java%nprogram%n");

// f) If the variable number is not equal to 7, display "The variable number is not equal to 7".
	System.out.print("Enter a number:");
        int number = input.nextInt();
if (number != 7) 
    System.out.println("The variable number is not equal to 7");


	}
}


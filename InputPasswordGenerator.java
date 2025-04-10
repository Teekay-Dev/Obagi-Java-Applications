//write a java program to generate a number based on the input of a user, 
//the upper limit of the number should be inclusive
import java.security.SecureRandom;
import java.util.Scanner;

public class InputPasswordGenerator{
	 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		SecureRandom secureRandom = new SecureRandom();
		
		System.out.print("Enter number: ");
		long num = scan.nextLong();
		if(num <= 0){
			System.out.println("Number must be greater than 0");
		}
		else{
			long number = secureRandom.nextLong(num)+1;
			System.out.println("The lower Limit is 0");
			System.out.println("The upper Limit is "+(num +1));
			
			System.out.printf("The generated number is %d%n",num);
		}
		
	}
}

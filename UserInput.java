import java.util.Scanner;


public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter your Name:");
		String name = input.nextLine();
		
		System.out.print("Enter your Address:");
		String address = input.nextLine();
		
		System.out.print("Enter your Age:");
        byte age = input.nextByte();
		
		System.out.print("Enter your Account balance:");
        float balance = input.nextFloat();
		
		System.out.print("Do you love Java(True/False): ");
        boolean isJava = input.nextBoolean();
		System.out.println();
		
		
		System.out.printf("Hello %s, you are welcome to First Bank,%n",name);
		System.out.printf("Your account balance is %c%.2f%n",'$',balance);
		System.out.printf("You are living in %s %n",address);
		System.out.printf("You are %d years old%n",age);
		System.out.printf("%s Do you love Java? %b%n",name,isJava);
	}
}
import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *606# To Borrow Data");
		System.out.println("");
		
		System.out.println("Enter Code: ");
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
			    System.out.println("Enter 1 for 1 Month Subscription");
		        System.out.println("Enter 2 for 2 Months Subscription");
		        System.out.println("Enter 3 for 3 Months Subscription");	
				System.out.println("Enter 4 for 4 Months Subscription");
				System.out.println("");
				
				System.out.println("Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println("Your 1 month data subscription has now been activated ");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 months data subscription has now been activated ");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 months data subscription has now been activated ");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 months data subscription has now been activated ");
					}
					break;
					
					default:
					System.out.println("Invalid Input.");
					
					
				}
			}
			break;
			
			case "*310#":
			{
			   System.out.println("Your Balance is N1,000.00");		
			}
			break;
			
			case "*606#":
			{
			    System.out.println("Enter 1 to borrow N1000");
		        System.out.println("Enter 2 to borrow N2000");
		        System.out.println("Enter 3 to borrow N3000");	
				System.out.println("Enter 4 to borrow N4000");
				System.out.println("");
				
				System.out.println("Enter Code: ");

                int option = input.nextInt();				
				
				switch(option){
					case 1:
					{
						System.out.println("You have borrowed N1000 of airtime");
					}
					break;
					
					case 2:
					{
						System.out.println("You have borrowed N2000 of airtime");
					}
					break;
					
					case 3:
					{
						System.out.println("You have borrowed N3000 of airtime");
					}
					break;
					
					case 4:
					{
						System.out.println("You have borrowed N4000 of airtime");
					}
					break;
					
					default:
					System.out.println("Invalid Input.");
				}
			}
			break;
			default:
			System.out.println("Invalid input");
			
		}
		
	}
}
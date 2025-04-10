import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shapes");
		System.out.println("Enter 1 to calculate perimeter of a square");
		System.out.println("Enter 2 to calculate perimeter of a rectangle");
		System.out.println("Enter 3 to calculate perimeter of a circle");
		System.out.println();
		
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.println("Enter the length of square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.println("Enter the length of rectangle: ");
				int lengthOfRectangle = input.nextInt();
				System.out.println("Enter the breath of rectangle: ");
				int breathOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lengthOfRectangle,breathOfRectangle);
			}
			break;
			
			case 3:
			{
			    System.out.println("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeter of a square is %d%n",perimeterOfSquare);
	}
    public static void shape(int length, int breath){
		int perimeterOfRectangle = 2 * (length + breath);
		
		System.out.printf("The perimeter of a rectangle is %d%n",perimeterOfRectangle);
	}
	public static void shape(double radius){
		double perimeterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The perimeter of a circle is %f%n",perimeterOfCircle);
	}
}
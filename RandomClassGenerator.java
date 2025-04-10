import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n",option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(1050)  + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
		
		long integerWithNoBound = random.nextLong();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		long integerWithBound = random.nextLong(1050)  + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
		
		float integerWithNoBound = random.nextFloat();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		float integerWithBound = random.nextFloat(1050)  + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
		
		double integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		double integerWithBound = random.nextInt(1050)  + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
	}
}	
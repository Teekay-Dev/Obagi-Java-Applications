public class  DataType{
	public static void main(String[] args){
		//Integer type (byte,short,int,long) 
		//Using byte(byte max = 255)
		byte age = 50;
		System.out.printf("You are %d years old %n",age);
		
		//Using short (Max = 32,767)
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business %n",quantity);
		
		//Using int (Max = 2,000,000,000)
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d %n",populationInNigeria);
		
		//Using long (Max = more than 1000000000)
		long worldpopulation = 8000000000L;
		System.out.printf("The world population is %d %n",worldpopulation);
		
		//Using float-point numbers(float, double)
		float weight = 5.6F;
		//using 1 decimal place
		System.out.printf("The bag of rice was %.1fkg %n",weight);
		
		//Using Double
		double acctBalance = 487575.94747;
		System.out.printf("Your account balance is %c%.2f %n",'$',acctBalance);	
		
		//Using Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is fikaboteekay@gmail.com",alpha);
	}
}
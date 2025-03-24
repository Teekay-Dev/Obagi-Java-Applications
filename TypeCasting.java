public class TypeCasting{
	public static void main(String[] args){
		//Widening Type Casting
		double weight = 678;
		System.out.printf("Your weight is %f%n",weight);
		
		//Narrowing Type Casting (ASCII CODE for ? = 63)
		char alpha = '?';
		 //to convert
		int asciiCode = (int)alpha;
		System.out.printf("The ascii code for ? is %d%n",asciiCode);
		
		double height = 5.8;
		
		int myHeight = (int)height;
		System.out.printf("My faculty's height is %d",myHeight);
	}
}
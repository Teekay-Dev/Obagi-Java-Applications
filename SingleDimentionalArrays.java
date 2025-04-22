public class SingleDimentionalArrays{
	public static void main(String[] args){
		int[] numbers = {5,7,3,9,2};
		
		String[] names = {"Teekay","Lilian","Big-Tee","Uche","Praise"};
		System.out.println("This is the traditinal for loop");
		
		for(int i = 0; 1 < 5; i++){
			System.out.printf("%s is %d years old %n",names[i],numbers[i]);
		}
		  System.out.println("================================");
		  for(String name : names){
			System.out.printf("%s%n",name);
		  }
		 System.out.println("================================");
		 for(int number : numbers){
     	 System.out.printf("%d%n",number);
		 }
	}
  }
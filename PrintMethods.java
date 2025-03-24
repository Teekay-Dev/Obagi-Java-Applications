public class PrintMethods{
     public static void main(String[] args){
		 //Using the print method --> print()
		 System.out.print("\"Learning Java is fun\"\n");
		 System.out.print(" Hey, come and learn Java with me");
		 
		 //Using the print method --> prinln()
		 System.out.println();
		 System.out.println("I want to tell you that java is different from Javascript");
		 System.out.println("\t this is the indented text");
		 
		 //Using the print method --> printf()
		 //using %s --> String
		 System.out.printf("My name is %s and I love %s%n","Teekay","sports");
		 //using %d --> Number
		 System.out.printf("I am living at No.%d Kaduna Street %n",1);
		 //using %f --> float numbers
		 System.out.printf("I bought Java JDK with %f Naira %n",159.345);
		 //using %nf --> To tell the number of decimal place
		 System.out.printf("I bought Java JDK with %.1f Naira %n",159.345);
		 System.out.printf("I bought Java JDK with %.2f Naira",159.345);
		 //using %c --> Character
		 System.out.printf("I bought Java JDK with %c%f %n",'$',159.345);
	 }
}

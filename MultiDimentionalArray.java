public class MultiDimentionalArray{
	public static void main(String[] args){
		int[][] numbers = {
			{5,3,45,1,32},
			{5,87,99,3,2},
			{3,89,6,56,4}
		};
		int sum = 0;
		int even = 0;
		int odd = 0;
		for(int row = 0; row < 3; row ++){
			for(int col = 0; col < 5; col++){
				sum += numbers[row][col];
			    if (numbers[row][col] % 2 == 0){
				     even++;
				}
				else{
				     odd++;
				}
			}
		}
		System.out.printf("The sum of all the element in the array is %d%n",sum);
		System.out.printf("The number of all the even numbers in the array is %d%n",even);
		System.out.printf("The number of all the odd numbers in the array is %d%n",odd);
	}
}


//Read about
// sort method, binary search method, equals method, compare method, fill method, copy method, to string method, deep to string method.
//Variablle Length Arguement List
//Command line argument
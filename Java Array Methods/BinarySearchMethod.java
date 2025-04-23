//2. Binary Search Method
//The binarySearch() method is used to search for an element in a sorted array efficiently
import java.util.Arrays;

public class BinarySearchMethod{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8};
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index); // Output: Index of 3: 2
    }
}

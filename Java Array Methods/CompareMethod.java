//4. Compare Method
//The compare() method compares two arrays alphabetical order.
import java.util.Arrays;

public class CompareMethod{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 2};
        System.out.println(Arrays.compare(array1, array2)); // Output: -1
    }
}
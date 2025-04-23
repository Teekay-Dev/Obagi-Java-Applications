//1. Sort Method
//The sort() method is used to arrange elements of an array or list in ascending order by default.
import java.util.Arrays;

public class SortMethod{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
    }
}
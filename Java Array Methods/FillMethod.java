//5. Fill Method
//The fill() method fills an array with a specified value
import java.util.Arrays;

public class FillMethod{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);
        System.out.println(Arrays.toString(numbers)); // Output: [7, 7, 7, 7, 7]
    }
}
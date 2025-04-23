//6. Copy Method
//The copyOf() method is used to copy an array into a new array.
import java.util.Arrays;

public class CopyMethod{
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3]
    }
}
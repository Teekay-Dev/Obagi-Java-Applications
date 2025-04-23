//8. Deep To String Method
//The deepToString() method is used for nested arrays to ensure proper string representation.
import java.util.Arrays;

public class DeepToStringMethod{
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix)); // Output: [[1, 2, 3], [4, 5, 6]]
    }
}





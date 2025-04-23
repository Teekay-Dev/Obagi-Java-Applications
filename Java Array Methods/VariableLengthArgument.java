//Variable Length Argument List
//A variable-length argument list allows methods to take multiple arguments of the same type 
//without explicitly defining them in the parameter list. It is denoted using ... in Java.
public class VariableLengthArgument{
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
    }

    static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
// Output: 1 2 3 4 5




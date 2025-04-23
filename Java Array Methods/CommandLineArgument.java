//Command Line Argument
//Command-line arguments allow users to pass values when running a Java program.
public class CommandLineArgument{
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}


//To run this program with arguments, use:
//java CommandLineArgument Hello World



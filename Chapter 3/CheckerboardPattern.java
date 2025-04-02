public class CheckerboardPattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) { // Outer loop for rows
            if (row % 2 == 0) {
                System.out.print(" "); // Print leading space for even rows
            }
            
            for (int col = 1; col <= 8; col++) { // Inner loop for columns
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
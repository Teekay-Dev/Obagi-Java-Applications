import java.util.Scanner;

public class ClassWorkVowelCounter{
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); 

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("========================================================================================%n");
        System.out.printf("Enter a String: ");
        String str = scanner.nextLine();

        // Calling the method
        int vowelCount = countVowels(str);

        System.out.println("Total vowel count: " + vowelCount);

        scanner.close(); 
    }
}
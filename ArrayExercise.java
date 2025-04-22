public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 3, 9, 2, 3, 7, 6, 5, 4};
        int sumOf4to6 = 0;
        int sumOf5to9 = 0;

        for (int i = 0; i < 10; i++) {
            if (i >= 4 && i <= 6) {
                sumOf4to6 += numbers[i];
            }
            if (i >= 5 && i <= 9) {
                sumOf5to9 += numbers[i];
            }
        }

        int result = sumOf4to6 + sumOf5to9;
        if (result % 2 == 0) {
            System.out.printf("The answer is %d, which is an even number", result);
        } else {
            System.out.printf("The answer is %d, which is an odd number", result);
        }
    }
}

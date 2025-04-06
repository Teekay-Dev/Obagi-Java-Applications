public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.printf("%-5s %20s%n", "n", "n!");

        for (int i = 1; i <= 20; i++) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.printf("%-5d %20d%n", i, factorial);
        }
    }
}
Ex.4.13
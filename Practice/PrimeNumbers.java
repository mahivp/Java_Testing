package Practice;

public class PrimeNumbers {
        public static void main(String[] args) {
            System.out.println("Prime numbers between 1 and 100 are:");

            for (int num = 2; num <= 100; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }


}

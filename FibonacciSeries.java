import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter input for number of series: ");

            int n= input.nextInt();

            int num1 = 0, num2 = 1;

            System.out.print("First " + n  + " terms of Fibonacci series: ");

            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + " ");

                // Compute the next term
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }
    }


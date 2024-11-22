package Practice;
import java.util.Scanner;

public class InvertedTriangle {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of rows for the inverted triangle: ");
            int rows = scanner.nextInt();


            for (int i = rows; i >= 1; i--) {

                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            scanner.close();
        }
}

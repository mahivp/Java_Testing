import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 4 integers");

        int a = scan.nextInt();
        /*int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();*/

        //int a=15, b=6,c=10, d=20; here we only giving the input

        //if Statement

        /*if(a>b){
            System.out.println("a is greater");
        }

        //if Else
        if(a>b){
            System.out.println("a is greater");
        }else {
            System.out.println("b is greater");
        }

        //nested if

        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        } else if (b>c && b>d) {
            System.out.println("b is greater");
        } else if (c>d) {
            System.out.println("c is greater");
        }else {
            System.out.println("d is greater");
        }*/

        // switch

        switch (a%7){
            case 0:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesady");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            default:
                System.out.println("Saturday");break;
        }


    }

}

public class ArithmeticOperator {

    public static void main(String[] args) {

        int a =10, b=5, c=4, d=8;

        // arithmetic operators

        System.out.println("add: "+ (a+b));
        System.out.println("sub: "+ (c-d));
        System.out.println("mul: "+ (a*b));
        System.out.println("div: "+ (c/d));
        System.out.println("mod: "+ (a%b));
        System.out.println("mod: "+ (c%d));

        System.out.println("increment: "+ (a++));  // pre increment
        System.out.println(("a value: "+ a));
        System.out.println("decrement: "+ (b--)); // pre decrement
        System.out.println(("b value: "+ b));

        System.out.println("increment: "+ (++c)); //post increment
        System.out.println(("c value: "+ c));
        System.out.println("decrement: "+ (--d)); // post decrement
        System.out.println(("d value: "+ d));

        int f= a+d; // f is an variable which is storing the data of addition
        System.out.println("add: "+ f);

    }
}

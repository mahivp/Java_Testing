public class Operators {

    public static void main(String[] args) {

        // int a =10, b=5;

        // arithmetic operators
        /*System.out.println("add:"+ (a+b));
        System.out.println("sub:"+ (a-b));
        System.out.println("mul:"+ (a*b));
        System.out.println("div:"+ (a/b));
        System.out.println("mod:"+ (a%b));

        System.out.println("increment:"+ (a++));  // pre increment
        System.out.println(("a value"+ a));
        System.out.println("decrement:"+ (b--)); // pre decrement
        System.out.println(("b value"+ b));
        System.out.println("power:"+ (a^b));

        System.out.println("increment:"+ (++a)); //post increment
        System.out.println(("a value"+ a));
        System.out.println("decrement:"+ (--b)); // post decrement
        System.out.println(("b value"+ b));*/

        // relational operators
        /*System.out.println("equals: " + (a==b));
        System.out.println("not equals: " + (a!=b));
        System.out.println("greater than: " + (a>b));
        System.out.println("lesser than: " + (a<b));
        System.out.println("greater than equal to: " + (a>=b));
        System.out.println("lesser than equal to: " + (a<=b));*/

        int a=2, b=4, c=5;
        //logical operators
        System.out.println("add: "+ ((a==b) && (a==c)));
        System.out.println("or: "+ ((a==b) || (a==c)));
        System.out.println("not: "+ !(a==b));

        // assigment operators
        System.out.println( "+=: " + (a+=5));
        System.out.println("-=: " + (a-=5));
        System.out.println("*=: " + (a*=5));
        System.out.println("/=: " + (a/=5));
        System.out.println("%=: " + (a%=5));
        System.out.println("aaa: " + a);


    }
}
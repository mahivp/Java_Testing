public class LogicalOperators {

    public static void main(String[] args) {

        int a=2, b=4, c=5;
        //logical operators
        System.out.println("add: "+ ((a==b) && (a==c)));
        System.out.println("or: "+ ((a==b) || (a==c)));
        System.out.println("not: "+ !(a==b));

        System.out.println("add: "+ ((b==c) && (c==a)));
        System.out.println("not: "+ !(b==c));

    }
}

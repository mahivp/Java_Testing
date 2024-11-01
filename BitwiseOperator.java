public class BitwiseOperator {

    public static void main(String[] args) {

        int a= 5, b=8;

        System.out.println("bit &: "+ (a&b));
        System.out.println("bit |: "+ (a|b));
        System.out.println("bit >>: "+ (a>>2));
        System.out.println("bit <<: "+ (a<<2));

        System.out.println("conditional: "+ (a>b?a-b:b-a));
        System.out.println("conditional: "+ (a>b?"a is big":"b is big"));

    }

}

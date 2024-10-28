public class Variables {
    static int a = 5;       //Class Variable
    String test = "Instance";  //Instance Variable

    public static void main(String[] args){

        Variables t = new Variables();

        int b = 15;     // Local Variable


        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
        System.out.println(t.test);
        test();
        t.test1();
    }

    public static void test(){
        System.out.println(a);
        Variables t = new Variables();
        System.out.println(t.test);
    }
    public void test1(){
        System.out.println(a);
        System.out.println(test);
    }
}

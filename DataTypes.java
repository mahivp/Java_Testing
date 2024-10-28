public class DataTypes {
    // Primitive  data types

    short a = 100; // Its having 16bit memory and range of -32768 to 32767
    int b = 20;  // Its having 32bit memory and range of -2147483648 to 2147483647
    long c = 456789 ; // Its having 64bit memory, all numbers including the range of integer and beyond
    float aa = 5678876.8655f; // Its having 32bit memory, all decimal numbers -> -e^45 to e^38
    double bbb = -1; // Its having a 64bit memory, all decimal numbers -> -e^324 to e^308
    double bbbb1 = 4567.54;
    long cc1 = 5645678;
    boolean cc = true;
    boolean ddd= false;
    char dddd = 'a';
    char dddd1 = '\t';

    // adavanced or wrapper data types
// all types are 64bit
    String s = "test";
    String ss =new String("test");

    Integer i = 400;
    Integer i1 = new Integer(150);


    Double d1 = 12.5;
    Short s1= 12;
    Long l1= 1234L;
    Float f1 = 123.1f;
    Character c1 = 'f';

    // This symbol is for Single line comment
    /*
    This for multi line comment
     */

    public static void main(String[] args) {

        DataTypes type = new DataTypes();
        System.out.println(type.a);
        System.out.println(type.bbbb1);
        System.out.println(type.cc1);
        System.out.println(type.c);
        System.out.println(type.b);
        System.out.println(type.aa);
        System.out.println(type.bbb);
        System.out.println(type.cc);
        System.out.println(type.dddd);
        System.out.println(type.dddd1);

        System.out.println(type.i);
        System.out.println(type.ss);
        System.out.println(type.d1);
        System.out.println(type.s1);
        System.out.println(type.l1);
        System.out.println(type.f1);
        System.out.println(type.c1);

        System.out.println(type.i.doubleValue());
        System.out.println(type.i.compareTo(type.i1));

    }

}

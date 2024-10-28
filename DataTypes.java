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

    }

}

public class Students1 {
    String name;
    int age= 21;
    boolean isEnrolled = true;

    Students1() {

    }
    Students1(int studentAge){ age = studentAge; }

    public void attendClass() {
        System.out.println(name + " is attending class at age " + age);
    }


    public static void main(String[] args) {
        Students1 student1 = new Students1();
        student1.name= "Mahi";
        System.out.println(student1.name + ":" + student1.age);
        student1.attendClass();

        Students1 student2 = new Students1(25);
        student2.name = "Ashok";
        System.out.println(student2.name + ";" + student2.age);
        student2.attendClass();

        Students1 student3 = new Students1(26);
        student3.name = "Bheema";
        System.out.println(student3.name + ";" + student3.age);
        student3.attendClass();

    }
}

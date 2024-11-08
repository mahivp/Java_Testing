package Practice;

public class Student {

    String branch;
    int year;
    String name;
    int age;
    double marks;

    public void getname(){
        System.out.println("Name of the Student is :" +name);
    }

    public void getage(){
        System.out.println("Age of the Student is :" +age);
    }

    public void getbranch(){
        System.out.println("Branch is :" +branch);
    }
    public void getyear(){
        System.out.println("Student in :" +year+"yr");
    }

    public void getmarks(){
        System.out.println("Marks is :" +marks+"percentage");
    }

    public static void main(String[] args) {

        Student M= new Student();

        M.name= "Sam";
        M.age= 21;
        M.branch= "E & C";
        M.year= 3;
        M.marks = 71;

        M.getname();
        M.getage();
        M.getbranch();
        M.getyear();
        M.getmarks();

    }

}

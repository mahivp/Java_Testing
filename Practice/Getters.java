package Practice;

public class Getters {

    private String name;
    private int age;


    // we are getting the value
    public int getAge() {
        return age;
    }

    // In setters we are setting the values
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Getters demo = new Getters();
        demo.setAge(25);
        demo.setName("Mahendra");
        System.out.println("Age :::"+demo.getAge()+"  Name ::::"+demo.getName());
    }



}

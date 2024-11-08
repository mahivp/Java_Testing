package Practice;

public class Man {

    String name;
    int age;
    float height;
    char gender;
    String Place;

    public void getGender(){
        System.out.println("Gender is: "+ gender);
    }

    public void getheight(){
        System.out.println("Height is: "+ height);
    }

    public void getname(){
        System.out.println("Name is: "+name);
    }

    public void getage(){
        System.out.println("Age is: "+ age);
    }

    public void getPlace(){
        System.out.println("Place is: "+Place);
    }

    public static void main(String[] args) {

        Man S= new Man();

        S.name= "Aarush";
        S.age = 10;
        S.gender= 'M';
        S.height= 3.2f;
        S.Place= "Mysuru";

        S.getname();
        S.getage();
        S.getheight();
        S.getGender();
        S.getPlace();


    }

}

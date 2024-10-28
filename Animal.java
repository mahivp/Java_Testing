public class Animal {

    int legs = 4;
    boolean tail = true;

    Animal(){

    }
    Animal(int legsCount){
        legs= legsCount;
    }
    public void walk(){

        System.out.println("-----"+legs+"---------"+legs+"--------");
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.legs);
        cat.walk();
        Animal human = new Animal(2);
        System.out.println(human.legs);
        human.walk();
        Animal dog = new Animal();
        System.out.println(dog.legs);
        Animal hen = new Animal(2);
        System.out.println(hen.legs);
        Animal fish = new Animal(0);
        System.out.println(fish.legs);
        fish.walk();
    }

}

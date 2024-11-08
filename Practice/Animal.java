package Practice;

public class Animal {

    String breed;
    String environment;
    int age;
    double weight;
    boolean isTrained;

    public void getbreed() {
        System.out.println("Species: " + breed);
    }

    public void getenvironmen() {
        System.out.println("Habitat: " + environment);
    }

    public void getAge() {
        System.out.println("Age: " + age + " years");
    }

    public void getWeight() {
        System.out.println("Weight: " + weight + " kg");
    }

    public void getistrainedStatus() {
        System.out.println("Endangered: " + (isTrained ? "Yes" : "No"));
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.breed = "Dog";
        animal.environment = "Home";
        animal.age = 5;
        animal.weight = 30.5;
        animal.isTrained = true;

        animal.getbreed();
        animal.getenvironmen();
        animal.getAge();
        animal.getWeight();
        animal.getistrainedStatus();
    }
}

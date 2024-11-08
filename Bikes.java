public class Bikes {

    String brand; // Declaring a String variable to store the brand of the bike
    String color;
    int speed;


    public static void main(String[] args) {

        // Creating an object 'z' of the Bike class
        Bikes bike = new Bikes(); //

        bike.brand = "Royal Enfiled"; //String value assigned to 'brand'
        bike.speed = 125;
        bike.color = "Black";

        // Printing the values of the object's attributes
        System.out.println(bike.brand);
        System.out.println(bike.color);
        System.out.println(bike.speed+"KMph");

    }
}

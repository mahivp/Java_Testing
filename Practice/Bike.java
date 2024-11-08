package Practice;

public class Bike {

    String brand;
    String model;
    double mileage;
    int releasedYear;
    double price;

    public void getBrand() {
        System.out.println("Bike brand is: " + brand);
    }

    public void getModel() {
        System.out.println("Model is: " + model);
    }

    public void getMileage() {
        System.out.println("Mileage is: " + mileage + " KMpl");
    }

    public void getreleasedYear() {
        System.out.println("Manufactured in: " + releasedYear);
    }

    public void getPrice() {
        System.out.println("Price is: Rs"+price);
    }

    public static void main(String[] args) {

        Bike myBike = new Bike();

        myBike.brand = "Royal Enfield";
        myBike.model = "Hmalayan 411";
        myBike.releasedYear = 2017;
        myBike.mileage = 25.0d;
        myBike.price = 395000;

        myBike.getBrand();
        myBike.getModel();
        myBike.getreleasedYear();
        myBike.getMileage();
        myBike.getPrice();
    }
}


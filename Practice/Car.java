package Practice;

public class Car {

    String make;
    String model;
    float mileage;
    int year;
    double price;

    public void getmake(){
        System.out.println("Car brand is :"+ make);
    }

    public void getmodel(){
        System.out.println("Model is: "+model);
    }

    public void getmileage(){
        System.out.println("Mileage is :"+ mileage+"KMpl");
    }

    public void getyear(){
        System.out.println("Manufactured in :"+ year);
    }

    public void getprice(){
        System.out.println("Price is :"+ price+ "Rupees");
    }

    public static void main(String[] args) {

        Car M= new Car();

        M.price= 1200000;
        M.make= "BMW";
        M.model= "S Series";
        M.year= 2023;
        M.mileage= 12.5f;

        M.getmake();
        M.getmodel();
        M.getyear();
        M.getmileage();
        M.getprice();

    }

}

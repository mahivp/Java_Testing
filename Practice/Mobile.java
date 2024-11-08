package Practice;

public class Mobile {

    String brand;
    String model;
    int capacity;
    double price;
    short storage;

    public void getbrand(){
        System.out.println("Brand is :"+ brand);
    }

    public void getmodel(){
        System.out.println("Model of the Mobile is :" +model);
    }

    public void getcapacity(){
        System.out.println("Capacity is :" +capacity+"mah");
    }

    public void getstorage(){
        System.out.println("Storage is :" +storage+"GB");
    }
    public void getprice(){
        System.out.println("Price of the Mobile is :" +price+"Rs");
    }

    public static void main(String[] args) {

        Mobile Z= new Mobile();

        Z.brand = "Samsung";
        Z.model = "S series";
        Z.storage= 128;
        Z.capacity= 4500;
        Z.price= 124000d;

        Z.getbrand();
        Z.getmodel();
        Z.getcapacity();
        Z.getstorage();
        Z.getprice();

    }

}

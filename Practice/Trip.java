package Practice;

public class Trip {

    String destination;
    String startDate;
    int duration; // duration in days
    String transportMode;
    double cost;

    public void getDestination() {
        System.out.println("Destination: " + destination);
    }

    public void getStartDate() {
        System.out.println("Start Date: " + startDate);
    }

    public void getDuration() {
        System.out.println("Duration: " + duration + " days");
    }

    public void getTransportMode() {
        System.out.println("Transport Mode: " + transportMode);
    }

    public void getCost() {
        System.out.println("Total Cost: Rs" + cost);
    }

    public static void main(String[] args) {

        Trip myTrip = new Trip();

        myTrip.destination = "Leh Ladakh";
        myTrip.startDate = "2024-12-24";
        myTrip.duration = 7;
        myTrip.transportMode = "Bike";
        myTrip.cost = 55000.00;

        myTrip.getDestination();
        myTrip.getStartDate();
        myTrip.getDuration();
        myTrip.getTransportMode();
        myTrip.getCost();
    }
}

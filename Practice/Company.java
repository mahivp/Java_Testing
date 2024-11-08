package Practice;

public class Company {

    String name;
    String location;
    int employees;
    String foundedYear;
    double revenue;

    public void getName() {
        System.out.println("Company Name: " + name);
    }

    public void getLocation() {
        System.out.println("Location: " + location);
    }

    public void getEmployees() {
        System.out.println("Number of Employees: " + employees);
    }

    public void getFoundedYear() {
        System.out.println("Founded Year: " + foundedYear);
    }

    public void getRevenue() {
        System.out.println("Revenue: " + revenue+"B");
    }

    public static void main(String[] args) {

        Company myCompany = new Company();

        myCompany.name = "SanDsik";
        myCompany.location = "Bengaluru";
        myCompany.employees = 50000;
        myCompany.foundedYear = "1 Jun 1988";
        myCompany.revenue = 5.56d;

        myCompany.getName();
        myCompany.getLocation();
        myCompany.getEmployees();
        myCompany.getFoundedYear();
        myCompany.getRevenue();
    }
}


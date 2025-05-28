package models;

public class Rental {
    private Car car;
    private String customerName;

    public Rental(Car car, String customerName) {
        this.car = car;
        this.customerName = customerName;
    }

    public Car getCar() { return car; }
    public String getCustomerName() { return customerName; }
}

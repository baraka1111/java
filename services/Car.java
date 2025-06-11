package services;

public class Car {
    private String id;
    private String model;
    private boolean booked;

    public Car(String id, String model) {
        this.id = id;
        this.model = model;
        this.booked = false;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return id + " - " + model + (booked ? " (Booked)" : " (Available)");
    }
}

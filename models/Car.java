package models;

public class Car {
    private String id;
    private String model;
    private boolean available;

    public Car(String id, String model) {
        this.id = id;
        this.model = model;
        this.available = true;
    }

    public String getId() { return id; }
    public String getModel() { return model; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return id + " - " + model + " (" + (available ? "Available" : "Booked") + ")";
    }
}

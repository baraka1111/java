package services;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Rental> rentals;
    private InventoryManager inventory;

    public BookingManager(InventoryManager inventory) {
        this.inventory = inventory;
        this.rentals = new ArrayList<>();
    }

    public void bookCar(String customerName, String carId) {
        Car car = inventory.findCarById(carId);
        if (car != null && car.isAvailable()) {
            car.setAvailable(false);
            rentals.add(new Rental(car, customerName));
            System.out.println("Car booked successfully!");
        } else {
            System.out.println("Car not available or not found.");
        }
    }

    public void returnCar(String carId) {
        Car car = inventory.findCarById(carId);
        if (car != null && !car.isAvailable()) {
            car.setAvailable(true);
            System.out.println("Car returned successfully!");
        } else {
            System.out.println("Car not found or not currently rented.");
        }
    }
}

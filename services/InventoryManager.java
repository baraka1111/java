package services;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Car> cars;

    public InventoryManager() {
        cars = new ArrayList<>();
        cars.add(new Car("01", "Toyota Corolla"));
        cars.add(new Car("02", "Honda Civic"));
        cars.add(new Car("03", "Ford Mustang"));
    }

    public void listAvailableCars() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    public Car findCarById(String id) {
    if (id == null) return null;
    String inputId = id.trim().toLowerCase();

    for (Car car : cars) {
        if (car.getId().toLowerCase().equals(inputId)) {
            return car;
        }
    }
    return null;
}}

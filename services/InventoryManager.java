package services;

import java.util.*;

public class InventoryManager {
    private Map<String, Car> cars = new HashMap<>();

    public InventoryManager() {
        
        cars.put("C01", new Car("C01", "Toyota Hilux"));
        cars.put("C02", new Car("C02", "BMW M3"));
        cars.put("C03", new Car("C03", "Mercedes c63s Coupe"));
    }

public void listAvailableCars() {
    System.out.println("\nAvailable Cars:");

    List<Car> sortedCars = new ArrayList<>(cars.values());
    sortedCars.sort(Comparator.comparing(Car::getId));

    boolean anyAvailable = false;
    for (Car car : sortedCars) {
        if (!car.isBooked()) {
            System.out.println(car);
            anyAvailable = true;
        }
    }

    if (!anyAvailable) {
        System.out.println("No cars available at the moment.");
    }
}


    public Car getCar(String carId) {
        return cars.get(carId);
    }
    public void listAllCarsRaw() {
    System.out.println("ALL CARS IN INVENTORY:");
    for (Car car : cars.values()) {
        System.out.println("Raw car object: " + car.getId() + ", booked=" + car.isBooked());
    }
}
}

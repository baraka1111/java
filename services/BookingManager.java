package services;

public class BookingManager {
    private InventoryManager inventory;

    public BookingManager(InventoryManager inventory) {
        this.inventory = inventory;
    }

    public boolean bookCar(String userName, String carId) {
        Car car = inventory.getCar(carId);
        if (car == null) {
            System.out.println("Car ID not found.");
            return false;
        }
        if (car.isBooked()) {
            System.out.println("Car is already booked.");
            return false;
        }
        car.setBooked(true);
        System.out.println("Car " + carId + " booked successfully for " + userName + ".");
        return true;
    }

    public boolean returnCar(String carId) {
        Car car = inventory.getCar(carId);
        if (car == null) {
            System.out.println("Car ID not found.");
            return false;
        }
        if (!car.isBooked()) {
            System.out.println("Car is not currently booked.");
            return false;
        }
        car.setBooked(false);
        System.out.println("Car " + carId + " returned successfully.");
        return true;
    }
}

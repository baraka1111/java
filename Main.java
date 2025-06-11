import services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        BookingManager booking = new BookingManager(inventory);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1. List Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                 System.out.println("Pressed 1 - Listing cars:");
                    inventory.listAllCarsRaw();
                    inventory.listAvailableCars();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter car ID: ");
                    String carId = scanner.nextLine();
                    booking.bookCar(name, carId);
                    break;
                case 3:
                    System.out.print("Enter car ID to return: ");
                    String returnCarId = scanner.nextLine();
                    booking.returnCar(returnCarId);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

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
            System.out.println("2. Book a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventory.listAvailableCars();
                    break;
                case 2:
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter car ID: ");
                    String carId = scanner.nextLine();
                    booking.bookCar(name, carId);
                    break;
                case 3:
                    scanner.nextLine();
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

import java.util.Scanner;

public class RideSharingBookingManager {
    public static void main(String[] args) {
        RideList rideList = new RideList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Ride Request System ---");
            System.out.println("1. Add Ride Request");
            System.out.println("2. Delete Ride Request by ID");
            System.out.println("3. Search Ride Request by ID");
            System.out.println("4. Display All Ride Requests");
            System.out.println("5. Sort Ride Requests by Fare");
            System.out.println("6. Print Ride Requests in Reverse");
            System.out.println("7. Calculate Total Fare");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Ride ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Pickup Location: ");
                    String pickup = scanner.nextLine();
                    System.out.print("Enter Dropoff Location: ");
                    String dropoff = scanner.nextLine();
                    System.out.print("Enter Fare: ");
                    float fare = Float.parseFloat(scanner.nextLine());;
                    RideRequest ride = new RideRequest(id, name, pickup, dropoff, fare);
                    rideList.insertAtEnd(ride);
                    break;
                case 2:
                    System.out.print("Enter Ride ID to delete: ");
                    int deleteId = scanner.nextInt();
                    rideList.deleteById(deleteId);
                    break;
                case 3:
                    System.out.print("Enter Ride ID to search: ");
                    int searchId = scanner.nextInt();
                    RideRequest found = rideList.searchById(searchId);
                    if (found != null) found.display();
                    else System.out.println("Ride not found.");
                    break;
                case 4:
                    rideList.displayAll();
                    break;
                case 5:
                    rideList.sortByFare();
                    break;
                case 6:
                    rideList.printReverse(rideList.getHead());
                    break;
                case 7:
                    float total = rideList.totalFare(rideList.getHead());
                    System.out.println("Total Fare: R" + total);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


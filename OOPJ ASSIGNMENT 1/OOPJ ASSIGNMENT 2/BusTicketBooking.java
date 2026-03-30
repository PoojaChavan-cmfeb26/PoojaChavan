import java.util.Scanner;

public class BusTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10]; // false = available, true = booked
        int choice;

        do {
            System.out.println("\n--- Bus Ticket Menu ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Seats:");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
                    }
                    break;
                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();
                    if (bookSeat >= 1 && bookSeat <= 10) {
                        if (!seats[bookSeat - 1]) {
                            seats[bookSeat - 1] = true;
                            System.out.println("Seat " + bookSeat + " booked successfully!");
                        } else {
                            System.out.println("Seat already booked!");
                        }
                    } else {
                        System.out.println("Invalid seat number!");
                    }
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    int cancelSeat = sc.nextInt();
                    if (cancelSeat >= 1 && cancelSeat <= 10) {
                        if (seats[cancelSeat - 1]) {
                            seats[cancelSeat - 1] = false;
                            System.out.println("Seat " + cancelSeat + " cancelled successfully!");
                        } else {
                            System.out.println("Seat is not booked!");
                        }
                    } else {
                        System.out.println("Invalid seat number!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
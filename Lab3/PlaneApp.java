import java.util.Scanner;

public class PlaneApp{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int choice;
        int seat_id, cust_id;
        Plane myPlane = new Plane();

        System.out.println("(1) Show the number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        do {
            System.out.println();
            System.out.print("    Enter the number of your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // Show number of empty seats
                        myPlane.showNumEmptySeats();
                        break;
                case 2: // Show the list of empty seats
                        myPlane.showEmptySeats();
                        break;
                case 3: // Show the list of customers with their seat numbers sorted by seat numbers
                        myPlane.showAssignedSeats(true);
                        break;
                case 4: // Show the list of customers with their seat numbers sorted by customer id
                        myPlane.showAssignedSeats(false);
                        break;
                case 5: // Assign a customer to a seat
                        System.out.println("Assigning Seat ..");
                        System.out.print("    Please enter SeatID 1~12: ");
                        seat_id = sc.nextInt();
                        System.out.print("    Please enter Customer ID: ");
                        cust_id = sc.nextInt();
                        myPlane.assignSeat(seat_id, cust_id);
                        break;
                case 6: // Remove a seat assignment
                        System.out.print("    Enter SeatID to unassign customer from 1~12: ");
                        seat_id = sc.nextInt();
                        myPlane.unAssignSeat(seat_id);
                break;

                case 7:
            }

        } while (choice < 7);

    }

}

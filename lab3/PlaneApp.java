import java.util.Scanner;

public class PlaneApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int choice;

        Plane p = new Plane();

        System.out.println("(1)Show number of empty seats");
        System.out.println("(2)Show list of empty seats");
        System.out.println("(3)Show list of seat assignments by seat ID");
        System.out.println("(4)Show list of seat assignments by customer ID");
        System.out.println("(5)Assign a customer to a seat");
        System.out.println("(6)Remove a seat assignment");
        System.out.println("(7)Exit");
        do{
            System.out.print("  Enter number of your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    p.showNumEmptySeats();
                    break;
                case 2:
                    System.out.println("The following seats are empty:");
                    p.showEmptySeats();
                    break;
                case 3:
                    System.out.println("The seat assignments are as follows:");
                    p.showAssignedSeats(true);
                    break;
                case 4:
                    System.out.println("The seat assignments are as follows:");
                    p.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat...");
                    System.out.print("  Please Enter SeatID: ");
                    int seatId = sc.nextInt();
                    System.out.print("  Please Enter Customer ID: ");
                    int custId = sc.nextInt();
                    p.assignSeat(seatId, custId);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign from customer: ");
                    int unassignID = sc.nextInt();
                    p.unAssignSeat(unassignID);
            }
        } while (choice!=7);
    }
        
}

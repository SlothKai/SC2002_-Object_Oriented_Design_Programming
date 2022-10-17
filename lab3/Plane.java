class Plane {

    public int numEmptySeat;
    public PlaneSeat seat[];
    private PlaneSeat sorted[] = new PlaneSeat[12];

    public Plane() {
        seat = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }

        numEmptySeat = seat.length;
    }

    public void sortSeats(PlaneSeat[] arrPS) {
        // clone arrays

        for (int i = 0; i < seat.length; i++) {
            sorted[i] = seat[i];
        }

        for (int i = 1; i < arrPS.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sorted[j - 1].getCustomerID() > sorted[j].getCustomerID()) {
                    PlaneSeat temp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        for (int j = 0; j < 12; j++) {
            if (!seat[j].isOccupied()) {
                System.out.println("SeatID " + seat[j].getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        if (bySeatId == true) {
            // sort by seatID
            for (int j = 0; j < 12; j++) {
                if (seat[j].isOccupied()) {
                    System.out.println("SeatID " + seat[j].getSeatID() + " assigned to CustomerID: "
                            + seat[j].getCustomerID() + ".");
                }
            }
        } else {

            sortSeats(seat);

            for (int j = 0; j < 12; j++) {
                if (sorted[j].isOccupied()) {
                    System.out.println("SeatID " + sorted[j].getSeatID() + " assigned to CustomerID: "
                            + sorted[j].getCustomerID() + ".");
                }
            }

        }
    }

    public void assignSeat(int seatId, int custId) {
        if (seat[seatId - 1].isOccupied()) {
            System.out.println("Seat already assigned to customer.");
        } else {
            seat[seatId - 1].assign(custId);
            numEmptySeat -= 1;
            System.out.println("Seat Assigned!");
        }
    }

    public void unAssignSeat(int seatId) {
        seat[seatId - 1].unassign();
        numEmptySeat += 1;
        System.out.println("Seat Unassigned!");
    }

}

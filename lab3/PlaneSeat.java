
class PlaneSeat {
    public int seatId = 0;
    public boolean assigned = false;
    public int customerId = 0;

    public PlaneSeat(int seat_Id) {
        this.seatId = seat_Id;
    }

    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        customerId = cust_id;
        assigned = true;
    }

    public void unassign() {
        customerId = 0;
        assigned = false;
    }

    public void print() {
        System.out.println("seatid = " + seatId + "\nassigned = " + assigned + "\ncustomerId = " + customerId);
    }
}

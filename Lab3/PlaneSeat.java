public class PlaneSeat{

    private int seatId = 0;
    private boolean assigned = false;
    private int customerId = 0;

    public PlaneSeat(int seat_id){
        this.seatId = seat_id;
    }
    public int getSeatID(){
        return this.seatId;
    }
    public int getCustomerID(){
        return this.customerId;
    }
    public boolean isOccupied(){
        return this.assigned;
    }
    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }
    public void unassign(){
        this.customerId = 0;
        this.assigned = false;
    }
}

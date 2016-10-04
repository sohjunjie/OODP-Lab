public class Plane{

    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        int i;
        this.numEmptySeat = 12;
        this.seat = new PlaneSeat[12];
        for(i=0;i<this.seat.length;i++){
            // initialize each plane seat
            this.seat[i] = new PlaneSeat(i+1);
        }
    }

    private PlaneSeat[] sortSeats(){

        int i, j, l = this.seat.length;
        PlaneSeat[] copySeat = new PlaneSeat[l];
        PlaneSeat tempSeat;

        //make a copy of seat attribute
        for(i=0; i<l; i++){
            copySeat[i] = new PlaneSeat(this.seat[i].getSeatID());
            if(this.seat[i].isOccupied())
                copySeat[i].assign(this.seat[i].getCustomerID());
        }

        for(i=1; i<l; i++)
    		for (j=0; j<l-i; j++)
    			if (copySeat[j].getCustomerID() > copySeat[j + 1].getCustomerID())
    			{
    				tempSeat = copySeat[j];
    				copySeat[j] = copySeat[j + 1];
    				copySeat[j + 1] = tempSeat;
    			}

        return copySeat;

    }

    public void showNumEmptySeats(){
        System.out.println(this.numEmptySeat + " are empty\n");
    }

    public void showEmptySeats(){
        int i;
        PlaneSeat[] displayPlaneSeat;

        if(this.numEmptySeat == 0){    //All seats are empty
            System.out.println("There is no empty seats in the plane!");
            return;
        }

        displayPlaneSeat = this.seat;

        for(i=0; i<displayPlaneSeat.length; i++)
            if(!displayPlaneSeat[i].isOccupied())
                System.out.println("SeatID " + displayPlaneSeat[i].getSeatID());

    }

    public void showAssignedSeats(boolean bySeatId){
        int i;
        PlaneSeat[] displayPlaneSeat;

        if(this.numEmptySeat == this.seat.length){    //All seats are empty
            System.out.println("No occupied seats in the plane yet!");
            return;
        }

        if(bySeatId)
            displayPlaneSeat = this.seat;
        else
            displayPlaneSeat = sortSeats();

        System.out.println("The seat assignments are as follow:");
        for(i=0; i<displayPlaneSeat.length; i++)
            if(displayPlaneSeat[i].isOccupied())
                System.out.println("SeatID " + displayPlaneSeat[i].getSeatID() + " assigned to CustomerID " + displayPlaneSeat[i].getCustomerID() + ".");

    }

    public void assignSeat(int seatId, int cust_id){
        if(!this.seat[seatId-1].isOccupied()){
            this.numEmptySeat--;
            this.seat[seatId-1].assign(cust_id);
            System.out.println("Seat Assigned!");
        }else
            System.out.println("Seat already assigned to a customer.");

    }

    public void unAssignSeat(int seatId){
        this.seat[seatId-1].unassign();
        this.numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }

}

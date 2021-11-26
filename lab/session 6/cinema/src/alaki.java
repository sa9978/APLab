public class alaki {
    private Seat seat;
    private Costumer costumer;
    private String

    public alaki(Seat seat, Costumer costumer) {
        this.seat = seat;
        this.costumer = costumer;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }
}

public class Booking {
    private Integer numberOfNights;
    private Bedroom bedroom;
    private Guest bookingGuest;

    public Booking(Integer numberOfNights, Bedroom bedroom, Guest bookingGuest) {
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
        this.bookingGuest = bookingGuest;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}

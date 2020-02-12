import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    public Booking booking;
    public Bedroom bedroom1;
    public Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom("1", 2);
        guest1 = new Guest("Bob");
        booking = new Booking(3, bedroom1, guest1);
    }

    @Test
    public void has_number_of_nights(){
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void has_bedroom(){
        assertEquals(bedroom1, booking.getBedroom());
    }

}

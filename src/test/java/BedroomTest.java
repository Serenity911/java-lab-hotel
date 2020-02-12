import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    public Bedroom bedroom;
    public Bedroom bedroom1;
    public Guest guest1;
    public Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom("1", 2);
        bedroom1 = new Bedroom("10", 1);
        guest1 = new Guest("Bob");
        guest2 = new Guest("Bill");
    }

    @Test
    public void has_room_number(){
        assertEquals("1", bedroom.getRoomNumber());
    }

    @Test
    public void has_type_double(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void has_type_single(){
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void count_guest_is_0(){
        assertEquals(0,bedroom.countGuest());
    }

    @Test
    public void is_booked_returns_false_because_no_guests(){
        assertEquals(false, bedroom.isBooked());
    }

    @Test
    public void add_guest_room_is_available(){
        bedroom.addGuest(guest1);
        assertEquals(true, bedroom.isBooked());
    }

    @Test
    public void cannot_add_guest_if_room_is_already_booked(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.countGuest());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    public ConferenceRoom conferenceRoom;
    public Guest guest1;
    public Guest guest2;
    public Guest guest3;
    public Guest guest4;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(3, "Blue room");
        guest1 = new Guest("Bill");
        guest2 = new Guest("Jim");
        guest3 = new Guest("Bob");
        guest4 = new Guest ("Sam");
    }

    @Test
    public void has_capacity(){
        assertEquals(3, conferenceRoom.getCapacity());
    }

    @Test
    public void has_a_name(){
        assertEquals("Blue room", conferenceRoom.getName());
    }

    @Test
    public void starts_with_0_guests(){
        assertEquals(0, conferenceRoom.countConferenceGuests());
    }

    @Test
    public void room_with_no_guests_are_not_booked(){
        assertEquals(false, conferenceRoom.isBooked());
    }

    @Test
    public void add_guest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.countConferenceGuests());
    }

    @Test
    public void cannot_add_guest_if_exceed_capacity(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        assertEquals(3, conferenceRoom.countConferenceGuests());
    }

    @Test
    public void cannot_book_guest_twice(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.countConferenceGuests());
    }

    @Test
    public void is_guest_in_the_room(){
        conferenceRoom.addGuest(guest1);
        assertEquals(true, conferenceRoom.isGuestBooked(guest1));
    }

    @Test
    public void can_remove_guest_if_in_the_room(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest1);
        assertEquals(1, conferenceRoom.countConferenceGuests());
    }




}

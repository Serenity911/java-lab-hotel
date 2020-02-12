import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    public Hotel hotel;
    public Bedroom bedroom1;
    public ConferenceRoom conference1;
    public Guest guest1;
    public Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Lo");
        bedroom1 = new Bedroom("2", 2);
        conference1 = new ConferenceRoom(3, "Yellow Room");
        guest1 = new Guest ("Bob");
        guest2 = new Guest ("Bill");

    }

    @Test
    public void has_a_name(){
        assertEquals("Lo", hotel.getName());
    }

    @Test
    public void add_a_bedroom(){
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void add_a_conference_room(){
        hotel.addRoom(conference1);
        assertEquals(1, hotel.countConferenceRoom());
    }

    @Test
    public void check_if_bedroom_already_in_list(){
        hotel.addRoom(bedroom1);
        assertEquals(true, hotel.isRoomAlreadyAdded(bedroom1));
    }

    @Test
    public void check_if_conference_room_already_in_list(){
        hotel.addRoom(conference1);
        assertEquals(true, hotel.isRoomAlreadyAdded(conference1));
    }

    @Test
    public void check_if_bedroom_not_in_the_list(){
        assertEquals(false, hotel.isRoomAlreadyAdded(bedroom1));
    }

    @Test
    public void check_if_conference_room_not_in_the_list(){
        assertEquals(false, hotel.isRoomAlreadyAdded(conference1));
    }

    @Test
    public void cannot_add_a_bedroom_twice(){
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void cannot_add_a_conference_room_twice(){
        hotel.addRoom(conference1);
        hotel.addRoom(conference1);
        assertEquals(1, hotel.countConferenceRoom());
    }

    @Test
    public void can_check_in_guest_in_bedroom(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuest());
    }

    @Test
    public void can_check_multiple_guest_in_double(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        hotel.checkInGuest(guest2, bedroom1);
        assertEquals(2, bedroom1.countGuest());
    }

    @Test
    public void can_check_in_guest_in_conference_room(){
        hotel.addRoom(conference1);
        hotel.checkInGuest(guest1, conference1);
        assertEquals(1, conference1.countConferenceGuests());
    }

    @Test
    public void can_check_multiple_guest_in_conference(){
        hotel.addRoom(conference1);
        hotel.checkInGuest(guest1, conference1);
        hotel.checkInGuest(guest2, conference1);
        assertEquals(2, conference1.countConferenceGuests());
    }

    @Test
    public void can_remove_guest_from_bedroom(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        hotel.removeGuest(guest1,bedroom1);
        assertEquals(0, bedroom1.countGuest());
    }

    @Test
    public void can_remove_multiple_guests_from_bedroom(){
        hotel.addRoom(bedroom1);
        hotel.checkInGuest(guest1, bedroom1);
        hotel.checkInGuest(guest2, bedroom1);
        hotel.removeGuest(guest1,bedroom1);
        hotel.removeGuest(guest2,bedroom1);
        assertEquals(0, bedroom1.countGuest());
    }

    @Test
    public void can_remove_guest_from_conference_room(){
        hotel.addRoom(conference1);
        hotel.checkInGuest(guest1, conference1);
        hotel.removeGuest(guest1,conference1);
        assertEquals(0, conference1.countConferenceGuests());
    }

    @Test
    public void can_remove_multiple_guests_from_conference_room(){
        hotel.addRoom(conference1);
        hotel.checkInGuest(guest1, conference1);
        hotel.checkInGuest(guest2, conference1);
        hotel.removeGuest(guest1, conference1);
        hotel.removeGuest(guest2, conference1);
        assertEquals(0, conference1.countConferenceGuests());
    }

}

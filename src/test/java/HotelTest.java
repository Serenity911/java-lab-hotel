import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    public Hotel hotel;
    public Bedroom bedroom1;

    @Before
    public void before(){
        hotel = new Hotel("Lo");
        bedroom1 = new Bedroom("2", 2);
    }

    @Test
    public void has_a_name(){
        assertEquals("Lo", hotel.getName());
    }

    @Test
    public void add_a_bedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void check_if_bedroom_already_in_list(){
        hotel.addBedroom(bedroom1);
        assertEquals(true, hotel.isBedroomAlreadyAdded(bedroom1));
    }

    @Test
    public void check_if_bedroom_not_in_the_list(){
        assertEquals(false, hotel.isBedroomAlreadyAdded(bedroom1));
    }

    @Test
    public void cannot_add_a_bedroom_twice(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }
}

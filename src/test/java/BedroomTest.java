import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    public Bedroom bedroom;
    public Bedroom bedroom1;

    @Before
    public void before(){
        bedroom = new Bedroom("1", 2);
        bedroom1 = new Bedroom("10", 1);
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

}

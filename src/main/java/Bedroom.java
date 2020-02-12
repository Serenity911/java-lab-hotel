import java.util.ArrayList;

public class Bedroom {
    private String roomNumber;
    private Integer capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(String roomNumber, Integer capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = capacity == 1 ? "Single" : "Double";
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public int countGuest(){
        return this.guests.size();
    }


    public boolean isBooked() {
        return this.guests.size() > 0;
    }

    public void addGuest(Guest guest) {
        if (!isBooked()){
            this.guests.add(guest);
        }
    }

}

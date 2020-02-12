import java.util.ArrayList;

public class ConferenceRoom {
    private Integer capacity;
    private String name;
    private ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(Integer capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.conferenceGuests = new ArrayList<Guest>();

    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int countConferenceGuests() {
        return this.conferenceGuests.size();
    }

    public boolean isBooked(){
        return countConferenceGuests() == this.capacity;
    }

    public void addGuest(Guest guest) {
        if(!isBooked() && !isGuestBooked(guest)){
            this.conferenceGuests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if(isGuestBooked(guest)){
            this.conferenceGuests.remove(guest);
        }
    }

    public boolean isGuestBooked(Guest guest) {
        return this.conferenceGuests.contains(guest);
    }
}



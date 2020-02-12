import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedrooms = new ArrayList<Bedroom>();
        this.bookings = new ArrayList<Booking>();
    }

    public String getName() {
        return this.name;
    }


    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRoom(){
        return this.conferenceRooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        if(!isRoomAlreadyAdded(bedroom)) {
            this.bedrooms.add(bedroom);
        }
    }

    public void addRoom(ConferenceRoom conferenceRoom) {
        if(!isRoomAlreadyAdded(conferenceRoom)) {
            this.conferenceRooms.add(conferenceRoom);
        }
    }

    public boolean isRoomAlreadyAdded(Bedroom bedroom) {
        return this.bedrooms.contains(bedroom);
    }

    public boolean isRoomAlreadyAdded(ConferenceRoom conferenceRoom) {
        return this.conferenceRooms.contains(conferenceRoom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if(isRoomAlreadyAdded(bedroom)){
            bedroom.addGuest(guest);
        }
    }

    public void checkInGuest(Guest guest, ConferenceRoom conferenceRoom) {
        if(isRoomAlreadyAdded(conferenceRoom)){
            conferenceRoom.addGuest(guest);
        }
    }

    public void removeGuest(Guest guest, Bedroom bedroom) {
        if (isRoomAlreadyAdded(bedroom)){
            bedroom.removeGuest(guest);
        }
    }

    public void removeGuest(Guest guest, ConferenceRoom conferenceRoom) {
        if (isRoomAlreadyAdded(conferenceRoom)){
            conferenceRoom.removeGuest(guest);
        }
    }

    public int countBookings(){
        return this.bookings.size();
    }

    public Booking bookRoom(Integer numberOfNights, Bedroom bedroom, Guest guest){
        Booking booking = new Booking(numberOfNights, bedroom, guest);
        this.bookings.add(booking);
        return booking;
    }

}

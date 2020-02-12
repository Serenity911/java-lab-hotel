import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name){
        this.name = name;
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedrooms = new ArrayList<Bedroom>();
    }

    public String getName() {
        return this.name;
    }


    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        if(!isBedroomAlreadyAdded(bedroom)) {
            this.bedrooms.add(bedroom);
        }
    }

    public boolean isBedroomAlreadyAdded(Bedroom bedroom) {
        return this.bedrooms.contains(bedroom);
    }
}

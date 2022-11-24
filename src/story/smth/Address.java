package story.smth;

import story.abstractions.Place;

import java.util.Objects;

public class Address extends Place {
    private String lane;
    private int houseNumber;

    public Address(Place street, Place lane, int houseNumber){
        super(street.getPlaceName(), street.getPlaceType(), street.getPlaceTypeCase());
        this.lane = lane.getPlaceName();
        this.houseNumber = houseNumber;
    }

    public String getAddress(){
        return String.format("%s. %s переулок, дом № %d,", super.getPlace(false)
                ,this.lane, this.houseNumber);
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Address address = (Address) otherObject;
        return houseNumber == address.houseNumber && Objects.equals(lane, address.lane) && getPlace(false).equals(address.getPlace(false));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), lane, houseNumber);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "lane='" + lane + '\'' +
                ", houseNumber=" + houseNumber +
                ", place="+getPlaceName()+
                '}';
    }
}

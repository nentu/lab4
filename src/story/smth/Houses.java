package story.smth;

import story.abstractions.Place;

import java.util.Objects;

public class Houses {

    private final String NAME = "Дома";

    private Place locationPlace;
    private String locationDesc;

    public Houses(){
        System.out.print(this.getName()+' ');
    }

    public void arrange(Place locationPlace, String description){
        this.locationPlace = locationPlace;
        this.locationDesc = description;

        System.out.print(this.getLocationPlace()+' ');
    }

    public String getLocationPlace() {
        return String.format("%s стояли %s ", locationPlace.getPlace(false), this.locationDesc);
    }

    public String getName(){
        return NAME;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Houses houses = (Houses) otherObject;
        return Objects.equals(getLocationPlace(), houses.getLocationPlace()) && Objects.equals(locationDesc, houses.locationDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, getLocationPlace(), locationDesc);
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "NAME='" + NAME + '\'' +
                ", locationPlace=" + locationPlace +
                ", locationDesc='" + locationDesc + '\'' +
                '}';
    }
}

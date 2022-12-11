package story.smth;
import story.Viewer;

import story.abstractions.Place;

import java.util.Objects;

public class Houses {
    public String getClassName(){return "Houses";}

    private final String NAME = "Дома";

    private Place locationPlace;
    private String locationDesc;

    public Houses(){
        Viewer.view(this.getName()+' ');
    }

    public void arrange(Place locationPlace, String description){
        this.locationPlace = locationPlace;
        this.locationDesc = description;

        Viewer.view(String.format("%s стояли %s ", locationPlace.getPlace(false), this.locationDesc)+' ');
    }

    public Place getLocationPlace() {
        return this.locationPlace;
    }

    public String getName(){
        return NAME;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Houses)) return false;
        Houses houses = (Houses) otherObject;
        return Objects.equals(getLocationPlace(), houses.getLocationPlace()) && Objects.equals(locationDesc, houses.locationDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, getLocationPlace(), locationDesc);
    }

    @Override
    public String toString() {
        return getClassName()+"{" +
                "NAME='" + NAME + '\'' +
                ", locationPlace=" + locationPlace +
                ", locationDesc='" + locationDesc + '\'' +
                '}';
    }
}

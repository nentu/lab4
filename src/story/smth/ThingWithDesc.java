package story.smth;

import story.abstractions.Place;
import story.abstractions.Thing;

import java.util.Objects;

public class ThingWithDesc extends Thing {
    private Place currentPlace;
    private String desc;

    public ThingWithDesc(String name, Place currentPlace, String description){
        super(name);
        this.currentPlace = currentPlace;
        this.desc = description;
    }

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public String getDesc() {
        return desc;
    }

    public String getFullDescription(Pronoun pronoun){
        return String.format("На %s %s %s %s", currentPlace.getPlaceName(), pronoun.getBe(), getName(), desc);
    }

    public int hashCode() {
        return Objects.hash(getName(), getCurrentPlace(), getDesc());
    }

    @Override
    public String toString() {
        return "Scarecrow[" +
                "name='" + getName() + '\'' +
                ", currentPlace=" + getCurrentPlace() +
                ", desc='" + getDesc() +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ThingWithDesc){
            ThingWithDesc scarecrow = (ThingWithDesc) obj;
            return this.getName().equals(scarecrow.getName()) &&
                    this.currentPlace.equals(scarecrow.currentPlace) &&
                    this.desc.equals(scarecrow.desc);
        }
        else return false;
    }

}

package story.smth;

import story.abstractions.Place;
import story.abstractions.Thing;

import java.util.Objects;

public class Good extends Thing {
    private String name;
    public String getName(){
        return name;
    }

    public Good(String name){
        this.name = name;
    }

    public String lay(Place place){

        return String.format("на %s в образцовом порядке лежали различные ", place.getPlaceName());
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Good[]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof  Good;
    }

}

package story.smth;

import story.abstractions.Place;
import story.abstractions.Thing;

import java.util.Objects;

public class Good extends Thing {

    public Good(String name){
        super(name);
    }

    public String lay(Place place){

        return String.format("на %s в образцовом порядке лежали различные ", place.getPlaceName());
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Good["+getName()+"]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof  Good;
    }

}

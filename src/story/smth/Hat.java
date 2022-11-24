package story.smth;

import java.util.Objects;

public class Hat {

    private final static String NAME = "шляпу";


    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return getClass().getName()+"{name=\""+getName()+"\"}";
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || (!getClass().equals(otherObject.getClass()))) return false;
        else {
            Hat hat = (Hat) otherObject;
            return getName().equals(hat.getName());
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(getClass(), getName());
    }
}

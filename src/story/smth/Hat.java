package story.smth;

import java.util.Objects;

public class Hat {
    public String getClassName(){return "Hat";}

    private final String NAME = "шляпу";


    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return getClassName()+"{name=\""+getName()+"\"}";
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (!(otherObject instanceof Hat)) return false;
        else {
            Hat hat = (Hat) otherObject;
            return getName().equals(hat.getName());
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(getClassName(), getName());
    }
}

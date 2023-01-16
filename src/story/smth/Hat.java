package story.smth;
import story.abstractions.Thing;

import java.util.Objects;

public class Hat extends Thing {
    public Hat(){
        super("шл€пу");
    }
    public String getClassName(){return "Hat";}
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

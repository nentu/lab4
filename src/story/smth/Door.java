package story.smth;

import story.abstractions.Thing;

import java.util.Objects;

public class Door extends Thing {
    public Door(){
        super("дверь");
    }

    public String open(){
        return getName()+" полицейского управления опять распахнулась";
    }

    public String click(){
        return getName()+ " щёлкнула";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Door)) return false;
        if (!super.equals(otherObject)) return false;
        Door dunno = (Door) otherObject;
        return Objects.equals(getName(), dunno.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

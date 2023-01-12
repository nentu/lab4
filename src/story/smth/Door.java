package story.smth;

import story.abstractions.Thing;

import java.util.Objects;

public class Door extends Thing {
    private final String name = "дверь";

    public String getName(){
        return this.name;
    }

    public String open(){
        return getName()+" полицейского управления опять распахнулась";
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

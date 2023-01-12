package story.smth;

import story.abstractions.Thing;

import java.util.Objects;

public class Сonsciousness extends Thing {
    private final String name = "сознание";

    public String getName(){
        return this.name;
    }

    public String comeBack(){
        return "Постепенно "+getName()+" вернулось к нему";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Сonsciousness)) return false;
        if (!super.equals(otherObject)) return false;
        Сonsciousness dunno = (Сonsciousness) otherObject;
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

package story.smth;

import story.Dunno;
import story.abstractions.Thing;

import java.util.Objects;

public class Sash extends Thing {

    public Sash(){
        super("обе створки");
    }

    public String open(){
        return " широко распахнулись";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Sash)) return false;
        if (!super.equals(otherObject)) return false;
        Sash dunno = (Sash) otherObject;
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

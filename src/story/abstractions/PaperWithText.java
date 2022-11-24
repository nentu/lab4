package story.abstractions;

import story.Dunno;
import story.interfaces.Readable;
import story.interfaces.Liftable;

import java.util.Objects;

public abstract class PaperWithText implements Readable, Liftable{
    public abstract String getText();

    @Override
    public String toString() {
        return getClass().toString();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        return otherObject != null && getClass() == otherObject.getClass();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getClass().hashCode());
    }

}

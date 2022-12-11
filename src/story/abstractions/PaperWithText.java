package story.abstractions;

import story.Dunno;
import story.interfaces.Readable;
import story.interfaces.Liftable;

import java.util.Objects;

public abstract class PaperWithText implements Readable, Liftable{
    public abstract String getText();
    public abstract String getName();

    public abstract String getClassName();

    @Override
    public String toString() {
        return getClassName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        return otherObject instanceof PaperWithText;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getClassName().hashCode());
    }

}

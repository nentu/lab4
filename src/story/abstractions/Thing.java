package story.abstractions;

import story.Exceptions.BadNameException;

import java.util.Objects;

public class Thing {
    private String name;
    public Thing(String name){
        this.name = name;
    }
    public String getName() throws BadNameException {
        if (!name.isEmpty())
            return name;
        else
            throw new BadNameException("");
    };

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode());
    }

    @Override
    public String toString() {
        return "Thing[]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Thing){
            Thing thing = (Thing) obj;

            return thing.getName().equals(this.getName());
        }
        else {
            return false;
        }
    }
}

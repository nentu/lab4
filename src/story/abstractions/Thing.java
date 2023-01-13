package story.abstractions;

import java.util.Objects;

public abstract class Thing {
    private String name;
    protected Thing(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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

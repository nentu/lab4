package story;

import story.smth.Showcase;

import java.util.Arrays;
import java.util.Objects;

public class Scarecrows {
    private Scarecrow[] group;
    private String name;

    public Scarecrows(String name, Scarecrow[] group){
        this.name = name;
        this.group = group;
    }

    public String getName(){
        return this.name;
    }

    public String madeWithSkill(String desc){
        return String.format("%s были сделаны с таким мастерством, что %s", getName(), desc);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Scarecrows)) return false;
        Scarecrows dunno = (Scarecrows) otherObject;
        return name.equals(dunno.name) && Arrays.equals(group, dunno.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, Arrays.hashCode(group));
    }

    @Override
    public String toString() {
        return "Scarecrows[" +
                "name='" + name + '\'' +
                ", members=" + Arrays.toString(group) +
                ']';
    }
}

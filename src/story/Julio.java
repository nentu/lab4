package story;


import story.abstractions.Place;
import story.abstractions.Character;
import java.util.Objects;

public class Julio extends Character {
    public String getClassName(){return "Julio";}

    private String estate;

    public Julio(String name, String estate){
        super(name, new Place(""));
    }


    @Override
    public String toString(){
        return super.toString()+"{estate="+estate+'}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Julio)) return false;
        if (!super.equals(otherObject)) return false;
        Julio julio = (Julio) otherObject;
        return Objects.equals(getName(), julio.getName()) && Objects.equals(estate, julio.estate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), estate);
    }
}

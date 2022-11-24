package story;


import java.lang.annotation.Inherited;
import java.util.Objects;

public class Julio extends OurFriend {

    private String name = "Жулио";
    private String estate;

    public Julio(String name, String estate){
        this.name = name;
        this.estate = estate;
    }

    public String getName(){
        return estate+" "+this.name;
    }

    @Override
    public String toString(){
        return super.toString()+"{estate="+estate+'}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        if (!super.equals(otherObject)) return false;
        Julio julio = (Julio) otherObject;
        return Objects.equals(getName(), julio.getName()) && Objects.equals(estate, julio.estate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), estate);
    }
}

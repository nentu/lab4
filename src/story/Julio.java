package story;


import story.abstractions.Place;
import story.abstractions.Сharacter;
import java.util.Objects;

public class Julio extends Сharacter{
    public String getClassName(){return "Julio";}

    private String name = "Жулио";
    private String estate;

    private Place currentPlace;

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }

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

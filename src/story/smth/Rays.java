package story.smth;
import story.Viewer;

import story.abstractions.Place;

import java.util.Objects;

public class Rays {
    public String getClassName(){return "Rays";}
    private String name;
    private Place lostPlace;

    public Rays(TypeOfRays typesOfRays){
        name = typesOfRays.getName();
        Viewer.view(this.getName()+' ');
    }

    public void lost(Place place){
        this.lostPlace = place;
        Viewer.view(this.getLostPlaceString()+' ');
    }

    public String getName() {
        return name;
    }

    public Place getLostPlace() {
        return lostPlace;
    }
    
    public String getLostPlaceString(){
        return "потерялись в "+this.getLostPlace().getPlace(false);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Rays)) return false;
        Rays rays = (Rays) otherObject;
        return Objects.equals(getName(), rays.getName()) && Objects.equals(getLostPlace(), rays.getLostPlace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClassName(), getName(), getLostPlace());
    }

    @Override
    public String toString() {
        return getClassName()+"{" +
                "name='" + name + '\'' +
                ", lostPlace=" + lostPlace +
                '}';
    }
}

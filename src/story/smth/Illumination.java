package story.smth;

import story.abstractions.Place;
import story.Viewer;
import java.util.Objects;

public class Illumination {
    public String getClassName(){return "Illumination";}
    private TypeOfIllumination illuminationType;
    private String description;
    private Place currentPlace;

    public Illumination(TypeOfIllumination type, String desc){
        this.illuminationType = type;
        this.description = desc;
        }

    public String getName(){
        return this.description+' '+this.illuminationType.getName();
    }

    public void setCurrentPlace(Place place){
        this.currentPlace = place;
    }

    public Place getCurrentPlace() {
        return currentPlace;
    }
    public String reign(){
        return String.format("царил %s", getCurrentPlace().getPlace(true));
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Illumination)) return false;
        Illumination illumination = (Illumination) otherObject;
        return illuminationType == illumination.illuminationType && Objects.equals(description, illumination.description) && Objects.equals(getCurrentPlace(), illumination.getCurrentPlace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClassName(), illuminationType, description, getCurrentPlace());
    }

    @Override
    public String toString() {
        return getClassName()+"{" +
                "illuminationType=" + illuminationType +
                ", description='" + description + '\'' +
                ", currentPlace=" + currentPlace +
                '}';
    }
}

package story.smth;

import story.abstractions.Place;

import java.util.Objects;

public class Illumination {
    private TypeOfIllumination illuminationType;
    private String description;
    private Place currentPlace;

    public Illumination(TypeOfIllumination type, String desc){
        this.illuminationType = type;
        this.description = desc;

        System.out.print(getName()+' ');

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
    public void reign(){
        System.out.print(String.format("царил %s", getCurrentPlace().getPlace(true)));
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Illumination illumination = (Illumination) otherObject;
        return illuminationType == illumination.illuminationType && Objects.equals(description, illumination.description) && Objects.equals(getCurrentPlace(), illumination.getCurrentPlace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), illuminationType, description, getCurrentPlace());
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "illuminationType=" + illuminationType +
                ", description='" + description + '\'' +
                ", currentPlace=" + currentPlace +
                '}';
    }
}

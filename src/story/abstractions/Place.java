package story.abstractions;

import story.smth.Case;
import story.smth.TypeOfPlaсe;

import java.util.Objects;

public class Place {
    private String placeName;
    private TypeOfPlaсe placeType;
    private Case placeTypeCase;



    public Place(String placeName, TypeOfPlaсe placeType, Case cases){
        this.placeName = placeName;
        this.placeType = placeType;
        this.placeTypeCase = cases;
    }

    public Place(String placeName){
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public TypeOfPlaсe getPlaceType() {
        return this.placeType;
    }

    public Case getPlaceTypeCase() {
        return placeTypeCase;
    }

    public String getPlace(boolean isReversed){
        if (!isReversed) return getPlaceName()+" "+getPlaceType().getText(getPlaceTypeCase());
        else return getPlaceType().getText(getPlaceTypeCase())+" "+getPlaceName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Place place = (Place) otherObject;
        return Objects.equals(getPlaceName(), place.getPlaceName()) && getPlaceType() == place.getPlaceType() && getPlaceTypeCase() == place.getPlaceTypeCase();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), getPlaceName(), getPlaceType(), getPlaceTypeCase());
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "placeName=\"" + getPlaceName() + '"' +
                ", placeType=" + getPlaceType() +
                ", placeTypeCase=" + getPlaceTypeCase() +
                '}';
    }
}

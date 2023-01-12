package story;
import story.abstractions.Place;
import story.abstractions.Character;

import java.util.Objects;

public class OurFriend extends Character {
    public String getClassName(){return "OurFriend";}
    private final String NAME = "наши друзья";
    protected Place currentPlace = new Place("Начало");

    public OurFriend() {
    }

    //перемещения
    public String arrive(Place place){
        setCurrentPlace(place);
        return String.format("добрались до %s ", place.getPlace(false));
    }

    public String turn(Place place){
        setCurrentPlace(place);
        return String.format("свернули в %s. ", place.getPlace(false));
    }

    //Setters, Getters
    public Place getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }
    public String getName(){
        return NAME;
    }

    //Others
    @Override
    public String toString() {
        return super.toString()+String.format("{currentPlace=%s}", getCurrentPlace().toString());
    }

    @Override
    public boolean equals(Object otherObject){
        return super.equals(otherObject);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode());
    }




}
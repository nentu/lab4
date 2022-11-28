package story;
import story.abstractions.Place;
import story.abstractions.Сharacter;

import java.util.Objects;

public class OurFriend extends Сharacter {
    private final String NAME = "наши друзья";
    protected Place currentPlace = new Place("Начало");

    public OurFriend() {
    }

    //перемещения
    public void arrive(Place place){
        setCurrentPlace(place);
        Viewer.view(String.format("добрались до %s ", place.getPlace(false)));
    }

    public void turn(Place place){
        setCurrentPlace(place);
        Viewer.view(String.format("свернули в \n%s. ", place.getPlace(false)));
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

    public void printName(){
        Viewer.view(this.getName()+' ');
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
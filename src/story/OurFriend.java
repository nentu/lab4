package story;
import story.abstractions.Place;
import story.abstractions.Сharacter;

import java.util.Objects;

public class OurFriend extends Сharacter {
    private static String NAME = "наши друзья";
    protected Place currentPlace = new Place("Начало");

    public OurFriend() {
    }

    //перемещения
    public void arrive(Place place){
        setCurrentPlace(place);
        System.out.print(String.format("добрались до %s ", place.getPlace(false)));
    }

    public void turn(Place place){
        setCurrentPlace(place);
        System.out.print(String.format("свернули в \n%s. ", place.getPlace(false)));
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
        System.out.print(this.getName()+' ');
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
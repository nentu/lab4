package story;
import story.abstractions.Place;
import story.abstractions.Character;

import java.util.Objects;

public class OurFriend extends Character {
    public String getClassName(){return "OurFriend";}


    public OurFriend() {
        super("наши друзья", new Place("Начало"));
    }

    public OurFriend(String name, Place place) {
        super(name, place);
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
package story;

import story.abstractions.Place;
import story.abstractions.Thing;
import story.abstractions.Character;
import story.smth.Hat;
import story.smth.Head;

import java.util.Objects;

public class Dunno extends OurFriend{
    public String getClassName(){return "Dunno";}

    private final String name;


    public Dunno(String name){
        this.name = name;
    }

    public String pull(Hat hat, Head head){
        return String.format("%s натянул потуже на %s", hat.getName(), head.getName());
    }

    public String look(String something){
        return "увидел, как "+something;
    }

    public String raise(Thing thing){
        return "поднял слетевшую с головы " + thing.getName();
    }

    public String fly(Place wherePlace){
        return ", невзвидя света, полетел через "+wherePlace.getPlaceName()+", ";
    }
    public String getName(){
        return this.name;
    }

    public String hideLetterAgain(Letter letter, Hat hat){
        return String.format("спрятал %s обратно в %s", letter.getName(), hat.getName());
    }

    public String bump(Thing byThing, Thing toThing){
        return String.format("стукнулся %s о %s", byThing.getName(), toThing.getName());
    }

    public String fallDown(Place place){
        return "вылетев прямо на улицу, грохнулся посреди "+place.getPlaceName();
    }

    public String jump(){
        return "быстро вскочил";
    }
    public String run(){
        return "подбежал к нему";
    }
    public String startHelp(){
        return "стал помогать подняться";
    }

    public String dontKnow(String thing){
        return "не знал, чем "+thing;
    }

    public String calmDown(Character character){
        return "утешить бедного "+character.getName().toLowerCase() + "а";
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Dunno)) return false;
        if (!super.equals(otherObject)) return false;
        Dunno dunno = (Dunno) otherObject;
        return Objects.equals(getName(), dunno.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

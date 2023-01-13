package story;

import story.abstractions.Character;
import story.abstractions.Place;
import story.smth.Pronoun;

import java.util.Objects;

public class Seller extends Character{
    private String desc;
    private Pronoun pronoun = Pronoun.HE;
    public Seller(String name, Place currentPlace, String description){
        super(name, currentPlace);
        desc = description;
    }

    public String getClassName(){
        return "Seller";
    }

    public String getFullDescription(){
        return getName()+" "+this.desc;
    }

    public String stick(String time, Place place, Character mannerCharacter){
        return String.format("%s, %s неподвижно торчал %s на манер %s", time,
                getName(), place.getPlaceName(), mannerCharacter.getFullDescription());
    }

    public String leanedForward(String time, String manner){
        return "как только " + time + ", он всем корпусом подался вперед, " + manner;
    }

    public String say(String time, String phrase){
        return time + "он сказал:" + phrase;
    }

    public String beWatched(String smth){
        return "увидев, что " + smth + ", ";
    }



    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Seller)) return false;
        if (!super.equals(otherObject)) return false;
        Seller dunno = (Seller) otherObject;
        return Objects.equals(getName(), dunno.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

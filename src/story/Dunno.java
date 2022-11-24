package story;

import story.smth.Hat;
import story.smth.Head;

import java.util.Objects;

public class Dunno extends OurFriend {

    private final String name;

    public Dunno(String name){
        this.name = name;
        System.out.print(getName());
    }

    public void pull(Hat hat, Head head){
        System.out.print(String.format("%s натянул потуже на %s", hat.getName(), head.getName()));
    }
    public String getName(){
        return this.name;
    }

    public void hideLetterAgain(Letter letter, Hat hat){
        System.out.print(String.format("спрятал %s обратно в %s", letter.getName(), hat.getName()));
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
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

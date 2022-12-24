package story;

import story.abstractions.PaperWithText;

import java.util.Objects;

public class Goat extends OurFriend{
    public String getClassName(){return "Goat";}
    private String name = "Козёл";
    private PaperWithText inHandObject;

    public Goat(String name){
        this.name = name;

    }

    //мои методы
    public String lift(PaperWithText obj){
        obj.setIsLifted(true);
        this.inHandObject = obj;
        return "поднял "+obj.getName();
    }
    @Override
    public String getName(){
        return this.name;
    }

    public String readFromHand(){
        return "прочитал написанный на нём aдрес \"" +this.inHandObject.getText()+'"';
    }

    //технические методы


    @Override
    public String toString() {
        return super.toString()+"{objInHand="+inHandObject+'}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Goat)) return false;
        if (!super.equals(otherObject)) return false;
        Goat goat = (Goat) otherObject;
        return Objects.equals(getName(), goat.getName()) && Objects.equals(inHandObject, goat.inHandObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), inHandObject);
    }
}

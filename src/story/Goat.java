package story;

import story.abstractions.PaperWithText;

import java.util.Objects;

public class Goat extends OurFriend {
    private String name = "Козёл";
    private PaperWithText inHandObject;

    public Goat(String name){
        this.name = name;
        Viewer.view(this.getName()+" ");
    }

    //мои методы
    public void lift(PaperWithText obj){
        Viewer.view("поднял "+obj.getName());
        obj.setIsLifted(true);
        this.inHandObject = obj;
    }
    @Override
    public String getName(){
        return this.name;
    }

    public void readFromHand(){
        Viewer.view("прочитал написанный на нём aдрес \"" +this.inHandObject.getText()+'"');
    }

    //технические методы


    @Override
    public String toString() {
        return super.toString()+"{objInHand="+inHandObject+'}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        if (!super.equals(otherObject)) return false;
        Goat goat = (Goat) otherObject;
        return Objects.equals(getName(), goat.getName()) && Objects.equals(inHandObject, goat.inHandObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), inHandObject);
    }
}

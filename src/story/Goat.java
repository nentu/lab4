package story;

import story.abstractions.PaperWithText;
import story.abstractions.Place;
import story.Exceptions.CantReadException;
import story.interfaces.Liftable;
import story.interfaces.Readable;

import java.util.Objects;

public class Goat extends OurFriend{
    public String getClassName(){return "Goat";}
    private Liftable inHandObject;

    public Goat(String name){
        super(name, new Place(""));

    }

    public String roll(Place place){
        return "из нее кубарем выкатятся на "+place.getPlaceName()+" "+getName();
    }

    //мои методы
    public String lift(Liftable obj){
        obj.setIsLifted(true);
        this.inHandObject = obj;
        return "поднял "+((PaperWithText) obj).getName();
    }


    public String ask(String[] manner){
        String manners = "";
        for (int i =0; i < manner.length-1; i++){
            manners += manner[i] + " и ";
        }
        manners +=manner[manner.length-1];
        return String.format("%s %s спросил:", manners, getName());
    }
    public String readFromHand() throws CantReadException {
        if (this.inHandObject instanceof Readable)
            return "прочитал написанный на нём aдрес \"" +((Readable) this.inHandObject).getText()+'"';
        else{
            throw new CantReadException(inHandObject);
        }
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

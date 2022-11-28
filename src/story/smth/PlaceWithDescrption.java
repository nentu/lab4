package story.smth;

import story.abstractions.Place;

import java.util.Arrays;

public class PlaceWithDescrption extends Place {

    private String[] desc;

    public PlaceWithDescrption(String name, TypeOfPlaсe type, Case cases, String ... desc){
        super(name, type, cases);

        this.desc = desc;
    }

    private String getDescripton(){
        String tmpDescription = "";
        for (int i = 0; i<this.desc.length - 1; i++) {
            tmpDescription += this.desc[i] + ", ";
        }

        tmpDescription += desc[desc.length-1];
        return tmpDescription;
    }

    public String getPlace(boolean isReversed){
        if (!isReversed){
        return getDescripton()+" "+super.getPlace(isReversed);}
        else {
            return super.getPlace(isReversed)+", "+getDescripton();
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        if (!super.equals(otherObject)) return false;
        PlaceWithDescrption that = (PlaceWithDescrption) otherObject;
        return Arrays.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(desc);
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "desc=" + Arrays.toString(desc) +
                '}';
    }
}

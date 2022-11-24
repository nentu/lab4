package story.abstractions;


import java.util.Objects;

public abstract class Сharacter {
    public abstract String getName();

    public abstract Place getCurrentPlace();

    public abstract void setCurrentPlace(Place place);

    @Override
    public String toString(){
        return getClass().getName()+
                "{name="+getName()+"" +
                "}";

    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass().equals(otherObject.getClass())){
            Сharacter other = (Сharacter) otherObject;
            return this.getName().equals(other.getName()) && this.getCurrentPlace().equals(other.getCurrentPlace());
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getCurrentPlace(), getClass());
    }
}
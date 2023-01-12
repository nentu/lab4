package story.abstractions;


import java.util.Objects;

public abstract class Character {

    public abstract String getClassName();
    public abstract String getName();

    public abstract Place getCurrentPlace();

    public abstract void setCurrentPlace(Place place);

    @Override
    public String toString(){
        return getClassName()+
                "{name="+getName()+"" +
                "}";

    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (otherObject instanceof java.lang.Character){
            Character other = (Character) otherObject;
            return this.getName().equals(other.getName()) && this.getCurrentPlace().equals(other.getCurrentPlace());
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getCurrentPlace(), getClassName());
    }
}
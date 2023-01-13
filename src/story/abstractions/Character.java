package story.abstractions;


import story.Seller;

import java.util.Objects;

public abstract class Character {
    private String name;
    private Place currentPlace;

    public Character(String name, Place place){
        this.name = name;
        this.currentPlace = place;
    }

    public String getFullDescription(){
        return getName()+" в "+getCurrentPlace().getPlaceName();
    }
    public abstract String getClassName();
    public String getName(){return name;};

    public Place getCurrentPlace(){return currentPlace;};

    public void setCurrentPlace(Place place){
        currentPlace = place;
    };

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
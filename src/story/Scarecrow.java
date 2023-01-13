package story;

import story.abstractions.Place;
import story.abstractions.Thing;
import story.smth.Good;

import java.util.Arrays;
import java.util.Objects;

public class Scarecrow {
    private String name;
    private Place currentPlace;
    private String desc;
    private Thing[] items;

    public Scarecrow(String name, Place currentPlace, String description, Thing[] items){
        this.name = name;
        this.currentPlace = currentPlace;
        this.desc = description;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public String getDesc() {
        return desc;
    }

    public Thing[] getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setItems(Thing[] items) {
        this.items = items;
    }

    private String getItemsList(){
        String stringItems = "";
        for (int i = 0; i < items.length - 1; i++){
            stringItems += items[i].getName() + " и ";
        }
        stringItems += items[items.length - 1].getName()+".";
        return stringItems;
    }

    public String getFullDescription(){
        return String.format("%s стояло чучело %s %s, %s", getCurrentPlace().getPlaceName(), getName(), getDesc(), getItemsList());
    }

    public int hashCode() {
        return Objects.hash(getName(), getCurrentPlace(), getDesc(), getItemsList());
    }

    @Override
    public String toString() {
        return "Scarecrow[" +
                "name='" + getName() + '\'' +
                ", currentPlace=" + getCurrentPlace() +
                ", desc='" + getDesc() + '\'' +
                ", items=" + getItemsList() +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Scarecrow){
            Scarecrow scarecrow = (Scarecrow) obj;
            return this.name.equals(scarecrow.name) &&
                    this.currentPlace.equals(scarecrow.currentPlace) &&
                    this.desc.equals(scarecrow.desc) &&
                    this.getItemsList().equals(scarecrow.getItemsList());
        }
        else return false;
    }
}

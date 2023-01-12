package story.smth;

import story.Friends;
import story.abstractions.Place;
import story.abstractions.Thing;

import java.util.Objects;

public class Guns extends Thing {
    private final String name = "ружья";
    private String desc[];

    public Guns(String[] desc){
        this.desc = desc;
    }

    private String getFullDescription(){
        String full_description = "";
        for (int i = 0; i < desc.length - 1; i++){
            full_description += desc[i] + ", ";
        }
        full_description += desc[desc.length - 1];
        return full_description;
    }
    public String jumpToEyes(){
        return String.format("Первое, что сразу бросалось в глаза, были %s %s", getName(), getFullDescription());
    }



    public String getName(){
        return name;
    }

    public String toString() {
        return super.toString()+String.format("{fullDescription=%s}", getFullDescription());
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (!(otherObject instanceof Guns)) return false;
        else {
            Guns frnds = (Guns) otherObject;
            if (desc.length == frnds.desc.length){
                for (int i=0; i<frnds.desc.length;i++){
                    if (!desc[i].equals(frnds.desc[i])) return false;
                }
                return true;
            }
            else return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), desc.hashCode());
    }

}

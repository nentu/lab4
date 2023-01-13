package story;

import story.abstractions.Character;
import story.abstractions.Place;

import java.util.Objects;

public class Friends {
    private String name = "friends";
    private Character[] friends;
    public Friends(Character[] friends){
        this.friends = friends;
    }

    public String getNames(){
        String names = "";
        for (int i = 0; i < this.friends.length - 1; i++){
            names+= friends[i].getName() + " и ";
        }
        names += friends[friends.length - 1].getName();
        return names;
    }

    public String enter(Place place, String manner){
        return String.format("%s, %s вошли в %s", manner, getNames(), place.getPlaceName());

    }

    public String stop(){
        return getNames()+" в нерешительности остановились";
    }

    public String understand(String smth){
        return "поняли "+smth;
    }

    public String notice(Character character, Place place){
        return String.format("%s %s как-то не сразу заметили %s", place.getPlaceName(), getNames(), character.getFullDescription());
    }

    public String toString() {
        String strings = "";
        for (int i = 0; i < this.friends.length - 1; i++){
            strings += friends[i].toString() + ", ";
        }
        strings += friends[friends.length - 1].toString();
        return "Friends{name=\""+this.name+"\",friends=["+strings+"]}";
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (!(otherObject instanceof Friends)) return false;
        else {
            Friends frnds = (Friends) otherObject;
            if (friends.length == frnds.friends.length){
                for (int i=0; i<frnds.friends.length;i++){
                    if (!friends[i].equals(frnds.friends[i])) return false;
                }
                return true;
            }
            else return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, friends);
    }




}

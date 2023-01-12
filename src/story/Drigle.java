package story;
import story.abstractions.Place;
import story.abstractions.Character;
import story.abstractions.Thing;

public class Drigle extends Character {
    private Place currentPlace = new Place("Здание");
    private final String name = "Дригль";
    @Override
    public String getName(){return this.name;}

    public String grab(Character character){
        return String.format("%s схватил %s за шиворот", getName(), character.getName());
    }

    public String put(){
        return "поставил напротив широкой двустворчатой двери";
    }

    public String hit(Thing thing){
        return String.format("с такой снятой огрел по затылку %s,", thing.getName());
    }

    @Override
    public String getClassName(){return "Drigle";}

    @Override
    public Place getCurrentPlace(){
        return this.currentPlace;
    }

    @Override
    public void setCurrentPlace(Place place){
        this.currentPlace = place;
    }



}

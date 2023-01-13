package story;
import story.abstractions.Place;
import story.abstractions.Character;
import story.abstractions.Thing;

public class Drigle extends Character {

    public Drigle(){
        super("Дригль", new Place("Здание"));
    }


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





}

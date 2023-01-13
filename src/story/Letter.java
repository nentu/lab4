package story;


import story.abstractions.PaperWithText;
import story.abstractions.Character;
import story.abstractions.Thing;
import story.smth.Address;

import java.util.Objects;

public class Letter extends PaperWithText{

    static class Envelope extends Thing {

        public Envelope(){
            super("белый конверт");
        }

        public String fallDown(){
            return "из неё выпал " + getName();
        }
    }
    public String getClassName(){return "Letter";}

    private Address adr;
    private Character recipient;
    private final String NAME = "письмо";

    private boolean isLifted = false;

    public Letter(Address adr, Character recipient){
        this.adr = adr;
        this.recipient = recipient;
    }
    
    public String getName(){
        return NAME;
    }

    public String getText(){
        return this.adr.getAddress()+" "+recipient.getName();
    }

    public void setIsLifted(boolean isLifted){
        this.isLifted = isLifted;
    }

    public boolean getIsLifted(){
        return this.isLifted;
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Letter)) return false;
        Letter letter = (Letter) otherObject;
        return Objects.equals(adr, letter.adr) && Objects.equals(recipient, letter.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adr, recipient);
    }


    @Override
    public String toString() {
        return super.toString()+"{address="+adr.toString()+", recipient="+recipient.toString()+"}";
    }

}

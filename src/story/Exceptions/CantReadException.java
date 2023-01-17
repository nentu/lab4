package story.Exceptions;

public class CantReadException extends Exception{
    private Object thing;
    public CantReadException(Object thing){
        super("Unreadable object");
        this.thing = thing;
    }

    public Object getThing() {
        return thing;
    }
}

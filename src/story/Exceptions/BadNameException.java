package story.Exceptions;

public class BadNameException extends RuntimeException{
    private String errorName;
    public BadNameException(String errorName){
        super("Bad name: "+errorName);
    }

}

package story.Exceptions;

public class BadNameException extends RuntimeException{
    private String errorName;
    public BadNameException(String errorName){
        this.errorName = errorName;
    }

    public String getErrorName() {
        return errorName;
    }
}

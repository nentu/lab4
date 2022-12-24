package story.abstractions;
import story.Viewer;

import story.smth.TimePast;

import java.util.Objects;

public class Time {
    public String getClassName(){return "Time";}
    public Time(){
    }

    public static String past(TimePast time){
        return String.format("Через %s ", time.getText());
    }

    @Override
    public String toString() {
        return getClassName()+"{}";
    }

    @Override
    public boolean equals(Object other){
        return other instanceof Time;
    }

    @Override
    public int hashCode(){
        return getClassName().hashCode();
    }
}

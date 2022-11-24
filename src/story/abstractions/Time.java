package story.abstractions;

import story.smth.TimePast;

import java.util.Objects;

public class Time {
    public Time(){
    }

    public static void past(TimePast time){
        System.out.printf("Через %s ", time.getText());
    }

    @Override
    public String toString() {
        return getClass().getName()+"{}";
    }

    @Override
    public boolean equals(Object other){
        return other.getClass().equals(getClass());
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }
}

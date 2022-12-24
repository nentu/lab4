package story.smth;

import java.util.Objects;

public class Head {
    public String getClassName(){return "Head";}
    private final static String  NAME = "голову";
    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return getClassName()+"{name=\""+getName()+"\"}";
    }


    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (!(otherObject instanceof Head)) return false;
        else {
            Head hat = (Head) otherObject;
            return getName().equals(hat.getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClassName(), getName());
    }
}
/*TODO
1) class viewer +
2) toString +
3) getClass?? (как можно сравнить название классов не вызывая этот метод) instanceof
4) equals +
 */
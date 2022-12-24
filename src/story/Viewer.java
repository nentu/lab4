package story;

import java.util.Objects;

public class Viewer {
    public void view (String string){
        System.out.print(string);
    }

    @Override
    public String toString(){
        return "viewer";
    }
    @Override
    public boolean equals(Object otherObject){
        return otherObject instanceof Viewer;
    }
    @Override
    public int hashCode(){
        return Objects.hash("Viewer");
    }
}

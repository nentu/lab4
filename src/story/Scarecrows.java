package story;

public class Scarecrows {
    private Scarecrow[] group;
    private String name;

    public Scarecrows(String name, Scarecrow[] group){
        this.name = name;
        this.group = group;
    }

    public String getName(){
        return this.name;
    }

    public String madeWithSkill(String desc){
        return String.format("%s были сделаны с таким мастерством, что %s", getName(), desc);
    }
}

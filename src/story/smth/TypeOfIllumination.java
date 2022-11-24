package story.smth;

public enum TypeOfIllumination {
    SUNNY("солнечно"),
    TWILIGHT("полумрак"),
    DARKNESS("тьма");
    private String name;
    TypeOfIllumination(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

package story.smth;

public enum TypeOfRays {
    LIGHT("лучи света"),
    LASER(" лазеры"),
    RADIATION("радиационные лучи");

    private String name;

    TypeOfRays(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

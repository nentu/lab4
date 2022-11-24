package story.smth;

public enum TypeOfPlaсe {
    STREET("улица", "улицы", "улице"),
    LANE("переулок", "переулка", "переулке"),
    BOTTOM("низ", "низа", "внизу"),
    FLOOR("этажи", "этажей", "этажах");

    private String nomForm;
    private String genCase;
    private String preposCase;

    TypeOfPlaсe(String nomCase, String genCase, String preposCase ){
        this.nomForm = nomCase;
        this.genCase = genCase;
        this.preposCase = preposCase;
    }

    public String getText(Case cases) {
        switch (cases){
            case NOMINATIVE:
                return this.nomForm;
            case GENITIVE:
                return this.genCase;
            case PREPOSITIONAL:
                return this.preposCase;
            default:
                return this.nomForm;
        }

    }
}

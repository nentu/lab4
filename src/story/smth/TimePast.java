package story.smth;

public enum TimePast {
    MINS10("10 минут"),
    MINS30("30 минут"){
        public String getText(){return "полчаса";}
    },
    HOURS1("1 час"),
    HOURS2("2 часа"),
    HOURS6("6 часа"),
    HOUR24("24 часа"),
    DAYS1("1 день");

    private String text;

    TimePast(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}

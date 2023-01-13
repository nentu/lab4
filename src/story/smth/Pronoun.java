package story.smth;

import story.abstractions.Place;

public enum Pronoun {
    HE("Он", "был"){
        public String notRecover(){
            return "От удара и от действия электричества "+this.getName()+" некоторое время не мог прийти в себя";
        }
        public String wantGetUp(){
            return this.getName()+" уже хотел подняться на ноги";
        }
    }, SHE("Она", "была"), IT("Оно","было"), THEY("Они", "были");

    private String name;
    private String be;
    Pronoun(String name, String be){
        this.name = name;
        this.be = be;
    }

    public String getName(){
        return this.name;
    }
    public String getBe(){
        return this.be;
    }

    public String notRecover(){
        return "не могу прийти в себя";
    }

    public String wantGetUp(){
        return this.getName()+" уже хочу подняться на ноги";
    }

    public String getUp(){
        return getName()+" поднялся на ноги";
    }

    public String threaten(Place place){
        return "погрозил кулаком по направлению к "+place.getPlaceName();
    }
}

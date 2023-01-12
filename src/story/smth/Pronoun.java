package story.smth;

import story.abstractions.Place;

public enum Pronoun {
    He("Он"){
        public String notRecover(){
            return "От удара и от действия электричества "+this.getName()+" некоторое время не мог прийти в себя";
        }
        public String wantGetUp(){
            return this.getName()+" уже хотел подняться на ноги";
        }
    }, She("Она"), It("Оно"), They("Они");

    private String name;
    Pronoun(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
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

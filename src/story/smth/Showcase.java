package story.smth;

import story.abstractions.Place;
import story.abstractions.Thing;

import java.util.Objects;

public class Showcase {
    private String name = "освещенные изнутри витрины";
    private Place place;

    public String build(Place place, Thing[] things){
        this.place = place;

        String textGoods = "";
        for (int i = 0; i < things.length - 1; i++){
            textGoods += things[i].getName() + ", ";
        }
        textGoods += things[things.length - 1].getName()+".";

        return String.format("%s были устроены %s, в которых, словно на выставке, красовались %s", place.getPlaceName(), this.name, textGoods);
    }

    public String put(){
        class PoliceItems extends Thing{
            public PoliceItems(String name){
                super(name);
            }
            public String getName(){
                return super.getName();
            }

            @Override
            public boolean equals(Object otherObject) {
                if (this == otherObject) return true;
                if (!(otherObject instanceof Door)) return false;
                if (!super.equals(otherObject)) return false;
                PoliceItems dunno = (PoliceItems) otherObject;
                return Objects.equals(getName(), dunno.getName());
            }


            @Override
            public int hashCode() {
                return Objects.hash(super.hashCode(), getName());
            }

            @Override
            public String toString() {
                return "PoliceItems[name="+name+"]";
            }
        }

        PoliceItems[] policeItems = new PoliceItems[]{
                new PoliceItems("резиновые электрические дубинки разных фасонов"),
                new PoliceItems("стальные наручники"),
                new PoliceItems("кандалы"),
                new PoliceItems("зажигательные и слезоточивые бомбы и другие предметы полицейского обихода")
            };

        String textItems = "";
        for (int i = 0; i < policeItems.length - 1; i++){
            textItems += policeItems[i].getName() + ", ";
        }
        textItems += policeItems[policeItems.length - 1].getName()+".";

        return String.format("были выставлены %s", textItems);
    }

    public String stayWithMask(Thing[] masks){
        String textMasks = "";
        for (int i = 0; i < masks.length - 1; i++){
            textMasks += "и такие, которые " + masks[i].getName() + ", ";
        }
        textMasks += "и такие, которые "+masks[masks.length - 1].getName()+".";

        return "Тут же находилась витрина, в которой были выставлены различные маски: "+textMasks;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof Showcase)) return false;
        if (!super.equals(otherObject)) return false;
        Showcase dunno = (Showcase) otherObject;
        return name.equals(dunno.name) && place.equals(dunno.place);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, place);
    }

    @Override
    public String toString() {
        return "Showcase[" +
                "name='" + name + '\'' +
                ", place=" + place +
                ']';
    }
}

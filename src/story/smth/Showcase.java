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

    public String putPoliceItems(String[] names){

        class PoliceItems extends Thing{
            private int id;
            private static int nextId = 4653786;
            public PoliceItems(String name){
                super(name);
                this.id = nextId;
                nextId += 1;
            }

            public int getId() {
                return this.id;
            }

            @Override
            public boolean equals(Object otherObject) {
                if (this == otherObject) return true;
                if (!(otherObject instanceof Door)) return false;
                if (!super.equals(otherObject)) return false;
                PoliceItems dunno = (PoliceItems) otherObject;
                return getName().equals(dunno.getName()) && getId() == dunno.getId();
            }


            @Override
            public int hashCode() {
                return Objects.hash(super.hashCode(), getName());
            }

            @Override
            public String toString() {
                return "PoliceItems[name="+getName()+"]";
            }
        }

        PoliceItems[] policeItems = new PoliceItems[names.length];

        for (int i = 0;i<names.length;i++)
            policeItems[i] = new PoliceItems(names[i]);

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

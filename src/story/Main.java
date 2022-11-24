package story;

import story.smth.PlaceWithDescrption;
import story.abstractions.Place;
import story.smth.*;
import story.abstractions.Time;

public class Main {
    public static void main(String[] args){
        Goat goat = new Goat("Козлик");

        Letter letter = new Letter(new Address(new Place("Крученая", TypeOfPlaсe.STREET, Case.NOMINATIVE),
                new Place("Змеиный", TypeOfPlaсe.LANE, Case.NOMINATIVE), 6),

                new Julio("Жулио", "владельцу магазина разнокалиберных товаров господину"));

        goat.lift(letter);

        System.out.print(" и ");

        goat.readFromHand();

        System.out.println(". ");

        Dunno dunno = new Dunno("Незнайка ");

        Hat hat = new Hat();

        dunno.hideLetterAgain(letter, hat);

        System.out.print(", а ");

        dunno.pull(hat, new Head());

        System.out.print(". ");

        Time.past(TimePast.MINS30);

        OurFriend friend = new OurFriend();

        friend.printName();

        friend.arrive(new Place("Крученой", TypeOfPlaсe.STREET, Case.GENITIVE));

        System.out.print("и ");

        PlaceWithDescrption narrowLane = new PlaceWithDescrption("", TypeOfPlaсe.LANE, Case.NOMINATIVE,
                "узенький", "змеей извивавшийся среди высоких домов,");

        friend.turn(narrowLane);

        Houses houses = new Houses();
        houses.arrange(new Place("по обеим сторонам", TypeOfPlaсe.LANE, Case.GENITIVE), "так" +
                " близко друг к другу");
        
        System.out.print(", что \n");

        Rays rays = new Rays(TypeOfRays.LIGHT);
        
        rays.lost(new Place("верхних", TypeOfPlaсe.FLOOR, Case.PREPOSITIONAL));
        
        System.out.print(",благодяра чему ");

        Illumination illumination = new Illumination(TypeOfIllumination.TWILIGHT, "таинственный");

        illumination.setCurrentPlace(new PlaceWithDescrption("", TypeOfPlaсe.BOTTOM, Case.PREPOSITIONAL, "где" +
                " были расположены многочисленные" +
                " магазины."));

        illumination.reign();

    }
}

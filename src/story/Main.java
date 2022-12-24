package story;
import story.Viewer;

import story.smth.PlaceWithDescrption;
import story.abstractions.Place;
import story.smth.*;
import story.abstractions.Time;

public class Main {
    public static void main(String[] args){
        Viewer viewer = new Viewer();

        Goat goat = new Goat("Козлик");

        viewer.view(goat.getName()+" ");

        Letter letter = new Letter(new Address(new Place("Крученая", TypeOfPlaсe.STREET, Case.NOMINATIVE),
                new Place("Змеиный", TypeOfPlaсe.LANE, Case.NOMINATIVE), 6),

                new Julio("Жулио", "владельцу магазина разнокалиберных товаров господину"));


        viewer.view(goat.lift(letter));

        viewer.view(" и ");

        viewer.view(goat.readFromHand());

        viewer.view(". ");

        Dunno dunno = new Dunno("Незнайка");
        viewer.view(dunno.getName() + " ");


        Hat hat = new Hat();

        viewer.view(dunno.hideLetterAgain(letter, hat));

        viewer.view(", а ");

        viewer.view(dunno.pull(hat, new Head()));

        viewer.view(". ");

        viewer.view(Time.past(TimePast.MINS30));

        OurFriend friend = new OurFriend();

        viewer.view(friend.getName() + " ");

        viewer.view(friend.arrive(new Place("Крученой", TypeOfPlaсe.STREET, Case.GENITIVE)));

        viewer.view("и ");

        PlaceWithDescrption narrowLane = new PlaceWithDescrption("", TypeOfPlaсe.LANE, Case.NOMINATIVE,
                "узенький", "змеей извивавшийся среди высоких домов,");

        viewer.view(friend.turn(narrowLane));

        Houses houses = new Houses();
        viewer.view(houses.getName() + " ");

        viewer.view(houses.arrange(new Place("по обеим сторонам", TypeOfPlaсe.LANE, Case.GENITIVE), "так" +
                " близко друг к другу"));
        
        viewer.view(", что \n");

        Rays rays = new Rays(TypeOfRays.LIGHT);

        viewer.view(rays.getName() + " ");
        
        viewer.view(rays.lost(new Place("верхних", TypeOfPlaсe.FLOOR, Case.PREPOSITIONAL)));
        
        viewer.view(",благодаря чему ");

        Illumination illumination = new Illumination(TypeOfIllumination.TWILIGHT, "таинственный");

        viewer.view(illumination.getName() + " ");

        illumination.setCurrentPlace(new PlaceWithDescrption("", TypeOfPlaсe.BOTTOM, Case.PREPOSITIONAL, "где" +
                " были расположены многочисленные" +
                " магазины."));

        viewer.view(illumination.reign());

    }
}

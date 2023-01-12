package story;

import story.abstractions.Character;
import story.abstractions.Time;
import story.abstractions.Place;
import story.abstractions.Thing;
import story.smth.*;

public class Main {
    public static void main(String[] args){
        Viewer viewer = new Viewer();

        Drigle drigle = new Drigle();
        Goat goat = new Goat("Козлик");
        Dunno dunno = new Dunno("Незнайка");
        Hat hat = new Hat();
        Houses houses = new Houses();
        Rays rays = new Rays(TypeOfRays.LIGHT);
        OurFriend friend = new OurFriend();
        Sash sash = new Sash();
        Сonsciousness сonsciousness = new Сonsciousness();
        Door door = new Door();
        Letter.Envelope envelope = new story.Letter.Envelope();
        Friends friends = new Friends(new Character[]{dunno, goat});
        Guns guns = new Guns(new String[]{"различных систем и калибров", "стоявшие стройными рядами на специальных деревянных подставках"});
        Good good = new Good("товар");
        Showcase showcase = new Showcase();

        /*
        viewer.view(drigle.grab((Character) dunno));

        viewer.view(" и ");

        viewer.view(drigle.put());

        viewer.view(drigle.hit(new Thing() {
            @Override
            public String getName() {
                return "дубинкой";
            }
        }));

        viewer.view(" что "+dunno.getName()+"\n");

        viewer.view(dunno.fly(new Place("всю комнату")));

        viewer.view(dunno.bump(new Head(), door));

        viewer.view(", отчего ");

        viewer.view(sash.getName());

        viewer.view(sash.open());

        viewer.view(", и, \n");

        viewer.view(dunno.fallDown(new Place("мостовой")));

        viewer.view(". ");

        viewer.view(Pronoun.He.notRecover());
        viewer.view(". ");

        viewer.view(сonsciousness.comeBack());
        viewer.view(", и \n");

        viewer.view(Pronoun.He.wantGetUp());

        viewer.view(", как вдруг увидел, что ");
        viewer.view(door.open());

        viewer.view(" и ");

        viewer.view(goat.roll(new Place("мостовую")));
        viewer.view(".\n ");

        viewer.view(dunno.getName()+" ");
        viewer.view(dunno.jump());
        viewer.view(", ");
        viewer.view(dunno.run());
        viewer.view(" и ");
        viewer.view(dunno.startHelp());
        viewer.view(". ");

        viewer.view(Pronoun.He.getUp());
        viewer.view(" и ");
        viewer.view(Pronoun.He.threaten(new Place("закрывшейся двери")));
        viewer.view(". \n");

        viewer.view(dunno.getName()+' ');
        viewer.view(dunno.dontKnow( dunno.calmDown(goat) ) + ". ");

        viewer.view(goat.ask(new String[]{"Вытерев рукавом слезы", "немного успокоившись"}));

        viewer.view(" В это время \n");

        viewer.view(dunno.getName()+" ");
        viewer.view(dunno.raise(hat));
        viewer.view(" и ");
        viewer.view(dunno.look(envelope.fallDown()));

        viewer.view(goat.getName()+" ");

        Letter letter = new Letter(new Address(new Place("Крученая", TypeOfPlaсe.STREET, Case.NOMINATIVE),
                new Place("Змеиный", TypeOfPlaсe.LANE, Case.NOMINATIVE), 6),

                new Julio("Жулио", "владельцу магазина разнокалиберных товаров господину"));


        viewer.view(goat.lift(letter));

        viewer.view(" и ");

        viewer.view(goat.readFromHand());

        viewer.view(". ");

        viewer.view(dunno.getName() + " ");



        viewer.view(dunno.hideLetterAgain(letter, hat));

        viewer.view(", а ");

        viewer.view(dunno.pull(hat, new Head()));

        viewer.view(". ");

        viewer.view(Time.past(TimePast.MINS30));


        viewer.view(friend.getName() + " ");

        viewer.view(friend.arrive(new Place("Крученой", TypeOfPlaсe.STREET, Case.GENITIVE)));

        viewer.view("и ");

        PlaceWithDescrption narrowLane = new PlaceWithDescrption("", TypeOfPlaсe.LANE, Case.NOMINATIVE,
                "узенький", "змеей извивавшийся среди высоких домов,");

        viewer.view(friend.turn(narrowLane));

        viewer.view(houses.getName() + " ");

        viewer.view(houses.arrange(new Place("по обеим сторонам", TypeOfPlaсe.LANE, Case.GENITIVE), "так" +
                " близко друг к другу"));
        
        viewer.view(", что \n");


        viewer.view(rays.getName() + " ");
        
        viewer.view(rays.lost(new Place("верхних", TypeOfPlaсe.FLOOR, Case.PREPOSITIONAL)));
        
        viewer.view(",благодаря чему ");

        Illumination illumination = new Illumination(TypeOfIllumination.TWILIGHT, "таинственный");

        viewer.view(illumination.getName() + " ");

        illumination.setCurrentPlace(new PlaceWithDescrption("", TypeOfPlaсe.BOTTOM, Case.PREPOSITIONAL, "где" +
                " были расположены многочисленные" +
                " магазины."));

        viewer.view(illumination.reign());
        */

        viewer.view(friends.enter(new Place("магазин"), "Увидев над дверью одного из магазинов вывеску с надписью \"Продажа разнокалиберных товаров\""));
        viewer.view(" и только тогда \n");
        viewer.view(friends.understand(", какого рода здесь продавались товары. "));

        viewer.view(guns.jumpToEyes()+". \n");

        viewer.view(good.lay(new Place("прилавке")));

        Good[] goods = new Good[]{
                new Good("пистолеты"),
                new Good("ножи"),
                new Good("финки"),
                new Good("кинжалы"),
                new Good("кистени"),
                new Good("кастеты")
        };

        String textGoods = "";
        for (int i = 0; i < goods.length - 1; i++){
            textGoods += goods[i].getName() + ", ";
        }
        textGoods += goods[goods.length - 1].getName();

        viewer.view(textGoods + "\n");

        viewer.view(showcase.build(new Place("вдоль стен"), new Good[]{
                new Good("наборы воровских отмычек"),
                new Good("стальные пилочки"),
                new Good("сверла"),
                new Good("клещи"),
                new Good("кусачки"),
                new Good("ломики"),
                new Good("фомки для взламывания замков"),
                new Good("автогенные аппараты для разрезания несгораемых шкафов и сундуков")
        }));

        viewer.view("\nВ витрине, над которой имелась надпись \"Полицейская утварь\" ");

        viewer.view(showcase.put()+"\n");

        viewer.view(showcase.stayWithMask(new Good[]{
                new Good("закрывают лишь верхнюю часть лица, с прорезами для глаз"),
                new Good("надеваются целиком на голову, в виде островерхого капюшона")
        }));
    }
}

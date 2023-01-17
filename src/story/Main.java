package story;

import story.abstractions.Character;
import story.abstractions.Thing;
import story.abstractions.Time;
import story.abstractions.Place;
import story.Exceptions.CantReadException;
import story.smth.*;

public class Main {
    public static void main(String[] args){
        Viewer viewer = new Viewer();

        Drigle drigle = new Drigle();
        Goat goat = new Goat("Козлик");
        Dunno dunno = new Dunno("Незнайка");
        Thing hat = new Thing("шляпу");
        Thing head = new Thing("голову");
        Houses houses = new Houses();
        Rays rays = new Rays(TypeOfRays.LIGHT);
        OurFriend friend = new OurFriend();
        Sash sash = new Sash();
        Door door = new Door();
        Letter letter = new Letter(new Address(new Place("Крученая", TypeOfPlaсe.STREET, Case.NOMINATIVE),
                new Place("Змеиный", TypeOfPlaсe.LANE, Case.NOMINATIVE), 6),

                new Julio("Жулио", "владельцу магазина разнокалиберных товаров господину"));

        Letter.Envelope envelope = letter.new Envelope();
        Friends friends = new Friends(new Character[]{dunno, goat});
        Guns guns = new Guns(new String[]{"различных систем и калибров", "стоявшие стройными рядами на специальных деревянных подставках"});
        Good good = new Good("товар");
        Showcase showcase = new Showcase();
        Scarecrow policeScarecrow = new Scarecrow("полицейского", new Place("В правом углу"), " в полном обмундировании", new Good[]{
                new Good("блестящей медной каской на голове"),
                new Good("дубинкой в руке")
        });
        Scarecrow rubberScarecrow = new Scarecrow("грабителя", new Place("В левом углу"), ", подкрадывающегося к несгораемой кассе", new Good[]{
                new Good("огромным пистолетом в одной руке"),
                new Good("потайным электрическим фонарем в другой")
        });

        Scarecrows pairOfScarecrows = new Scarecrows("Оба чучела",new Scarecrow[]{
                policeScarecrow,
                rubberScarecrow
        });
        Seller seller = new Seller("продавец", new Place("магазин"), "нижняя половина которого скрывалась за прилавком, верхняя же была одета в серую, скрадывающуюся на фоне серой стены фуфайку.");



        viewer.view(drigle.grab(dunno));

        viewer.view(" и ");

        viewer.view(drigle.put());

        viewer.view(drigle.hit(new Good("дубинкой")));

        viewer.view(" что "+dunno.getName()+"");

        viewer.view(dunno.fly(new Place("всю комнату")));

        viewer.view(dunno.bump(head, door));

        viewer.view(", отчего ");

        viewer.view(sash.getName());

        viewer.view(sash.open());

        viewer.view(", и, ");

        viewer.view(dunno.fallDown(new Place("мостовой")));

        viewer.view(". ");

        viewer.view(Pronoun.HE.notRecover());
        viewer.view(". ");

        viewer.view(Dunno.Consciousness.comeBack());
        viewer.view(", и ");

        viewer.view(Pronoun.HE.wantGetUp());

        viewer.view(", как вдруг увидел, что ");
        viewer.view(door.open());

        viewer.view(" и ");

        viewer.view(goat.roll(new Place("мостовую")));
        viewer.view(". ");

        viewer.view(dunno.getName()+" ");
        viewer.view(dunno.jump());
        viewer.view(", ");
        viewer.view(dunno.run());
        viewer.view(" и ");
        viewer.view(dunno.startHelp());
        viewer.view(". ");

        viewer.view(Pronoun.HE.getUp());
        viewer.view(" и ");
        viewer.view(Pronoun.HE.threaten(new Place("закрывшейся двери")));
        viewer.view(". ");

        viewer.view(dunno.getName()+' ');
        viewer.view(dunno.dontKnow( dunno.calmDown(goat) ) + ". ");

        viewer.view(goat.ask(new String[]{"Вытерев рукавом слезы", "немного успокоившись"}));

        viewer.view(" В это время ");

        viewer.view(dunno.getName()+" ");
        viewer.view(dunno.raise(hat));
        viewer.view(" и ");
        viewer.view(dunno.look(envelope.fallDown()));

        viewer.view(goat.getName()+" ");



        viewer.view(goat.lift(letter));

        viewer.view(" и ");

        try {
            viewer.view(goat.readFromHand());
        }
        catch (CantReadException e){
            Object t = e.getThing();
            if (t instanceof Thing)
                viewer.view("Не может прочитать "+((Thing) t).getName());
            else
                viewer.view("Не может прочитать "+t.toString());
        }

        viewer.view(". ");

        viewer.view(dunno.getName() + " ");



        viewer.view(dunno.hideLetterAgain(letter, hat));

        viewer.view(", а ");
        viewer.view(dunno.pull(hat, head));

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
        
        viewer.view(", что ");


        viewer.view(rays.getName() + " ");
        
        viewer.view(rays.lost(new Place("верхних", TypeOfPlaсe.FLOOR, Case.PREPOSITIONAL)));
        
        viewer.view(",благодаря чему ");

        Illumination illumination = new Illumination(TypeOfIllumination.TWILIGHT, "таинственный");

        viewer.view(illumination.getName() + " ");

        illumination.setCurrentPlace(new PlaceWithDescrption("", TypeOfPlaсe.BOTTOM, Case.PREPOSITIONAL, "где" +
                " были расположены многочисленные" +
                " магазины."));

        viewer.view(illumination.reign());


        viewer.view(friends.enter(new Place("магазин"), "Увидев над дверью одного из магазинов вывеску с надписью \"Продажа разнокалиберных товаров\""));
        viewer.view(" и только тогда ");
        viewer.view(friends.understand(", какого рода здесь продавались товары. "));

        viewer.view(guns.jumpToEyes()+". ");

        viewer.view(good.lay(new Place("прилавке")));

        {
            Good[] goods = new Good[]{
                    new Good("пистолеты"),
                    new Good("ножи"),
                    new Good("финки"),
                    new Good("кинжалы"),
                    new Good("кистени"),
                    new Good("кастеты")
            };

            String textGoods = "";
            for (int i = 0; i < goods.length - 1; i++) {
                textGoods += goods[i].getName() + ", ";
            }
            textGoods += goods[goods.length - 1].getName();

            viewer.view(textGoods + "");
        }

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

        viewer.view("В витрине, над которой имелась надпись \"Полицейская утварь\" ");

        viewer.view(showcase.putPoliceItems(new String[]{
                "резиновые электрические дубинки разных фасонов",
                "стальные наручники",
                "кандалы",
                "зажигательные и слезоточивые бомбы и другие предметы полицейского обихода"
        })+"");

        viewer.view(showcase.stayWithMask(new Good[]{
                new Good("закрывают лишь верхнюю часть лица, с прорезами для глаз"),
                new Good("надеваются целиком на голову, в виде островерхого капюшона")
        }));

        viewer.view("Кроме масок, здесь были также ");

        {
            Good[] goods = new Good[]{
                    new Good("грим"),
                    new Good("парики"),
                    new Good("накладные бороды"),
                    new Good("усы")
            };

            String textGoods = "";
            for (int i = 0; i < goods.length - 1; i++) {
                textGoods += goods[i].getName() + ", ";
            }
            textGoods += goods[goods.length - 1].getName();

            viewer.view(textGoods);
        }

        viewer.view("- все, что помогает изменить внешность.");

        viewer.view(policeScarecrow.getFullDescription());
        viewer.view(rubberScarecrow.getFullDescription());


        viewer.view(new ThingWithDesc("пестрый клетчатый платок", new Place("его шее"), "").getFullDescription(Pronoun.HE)+", ");
        viewer.view(new ThingWithDesc("клетчатая кепка", new Place("голове"), "с широким козырьком")
                .getFullDescription(Pronoun.SHE).toLowerCase()+", ");
        viewer.view(new ThingWithDesc("клетчатые брюки", new Place("его ногах"), "облешающие тело")
                .getFullDescription(Pronoun.THEY).toLowerCase()+", ");
        viewer.view(new ThingWithDesc("черная маска", new Place("лице"), "")
                .getFullDescription(Pronoun.SHE).toLowerCase()+".");


        viewer.view(pairOfScarecrows.madeWithSkill("их можно было принять за настоящих живых коротышек")+". ");

        viewer.view(friends.notice(seller, new Place("Среди этих удивительных экспонатов")) + "");

        viewer.view(seller.stick("Пока в магазине никого не было", new Place("у себя за прилавком"),
                new Character("паука", new Place()) {
                    @Override
                    public String getClassName() {
                        return "Spider";
                    }
                    @Override
                    public String getFullDescription(){
                        return getName() + " терпеливо поджидающего, когда в его паутину попадет муха";
                    }
                }));

        viewer.view(", но ");

        viewer.view(seller.leanedForward(door.click(), "опершись о прилавок руками, словно собрался выскочить из-за него")+". ");

        viewer.view(seller.say(seller.beWatched( friends.stop() ), ""));
    }
}

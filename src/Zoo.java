import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Zoo {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("Акела",AviaryType.SMALL);
        Bear bear = new Bear("Миша",AviaryType.BIG);
        Fish fish = new Fish("Морской Чёрт",AviaryType.POND);

        Duck duck = new Duck("Дональд",AviaryType.POND);
        Panda panda = new Panda("Дизайнер",AviaryType.BIG);
        Elephant elephant = new Elephant("Дамбо",AviaryType.SUPER_BIG);

        Worker worker = new Worker("Алексей", "Работник зоопарка");

        AviaryType small = AviaryType.SMALL;
        AviaryType big = AviaryType.BIG;
        AviaryType super_big = AviaryType.SUPER_BIG;
        AviaryType pond_ = AviaryType.POND;

        Aviary aviarySmall = new Aviary(AviaryType.SMALL);
        Aviary aviaryBig = new Aviary(AviaryType.BIG);
        Aviary aviarySuperBig = new Aviary(AviaryType.SUPER_BIG);
        Aviary aviaryPond = new Aviary(AviaryType.POND);

        aviarySmall.addAnimal(bear,aviaryBig);
        aviarySmall.addAnimal(panda,aviaryBig);

        aviaryBig.show(bear,aviaryBig);

    }
}
import animals.*;
import food.*;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("Акела", AviaryType.SMALL);
        Bear bear = new Bear("Миша", AviaryType.BIG);
        Fish fish = new Fish("Морской Чёрт", AviaryType.POND);

        Duck duck = new Duck("Дональд", AviaryType.POND);
        Panda panda = new Panda("Дизайнер", AviaryType.BIG);
        Elephant elephant = new Elephant("Дамбо", AviaryType.SUPER_BIG);

        Worker worker = new Worker("Алексей", "Работник зоопарка");

        Aviary aviarySmall = new Aviary(AviaryType.SMALL);
        Aviary aviaryBig = new Aviary(AviaryType.BIG);
        Aviary aviarySuperBig = new Aviary(AviaryType.SUPER_BIG);
        Aviary aviaryPond = new Aviary(AviaryType.POND);

        //Проверки

        Aviary.addAnimal(elephant, aviarySmall);  // Пытаемся положить слона в маленький вальер
        Aviary.addAnimal(wolf, aviaryPond);       // Волка в бассейн
        Aviary.addAnimal(fish, aviarySuperBig);   // Рыбу в загон для слона
        Aviary.addAnimal(duck, aviarySmall);      // Утку в загон для волка

        System.out.println();

        Aviary.addAnimal(bear, aviaryBig);        // Медведь хищник
        Aviary.addAnimal(panda, aviaryBig);       // Панда в вальер уже не попадёт

        Aviary.show(aviaryBig);

        Aviary.deleteAnimal(bear, aviaryBig);     // Убираю хищника
        Aviary.addAnimal(panda, aviaryBig);       // Кладу травоядную панду
        Aviary.addAnimal(bear, aviaryBig);        // Хищный медведь уже не может быть помещен в вальер

        Aviary.show(aviaryBig);

        System.out.println();

        Aviary.addAnimal(fish, aviaryPond);       // Аналогично с плавающими животными, рыба хищник
        Aviary.addAnimal(duck, aviaryPond);       // Утка травоядное, в пруд уже не попадёт

        Aviary.show(aviaryPond);

        Aviary.deleteAnimal(fish, aviaryPond);
        Aviary.addAnimal(duck, aviaryPond);
        Aviary.addAnimal(fish, aviaryPond);

        Aviary.show(aviaryPond);

        Aviary.getValue("Дональд", aviaryPond);
        Aviary.getValue("Дизайнер", aviaryBig);


        //Проверка кормления с эксепшеном
        System.out.println();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(bear);
        animals.add(wolf);
        animals.add(fish);
        animals.add(duck);
        animals.add(panda);
        animals.add(elephant);

        Meat beef = new Beef();
        Meat chicken = new Chicken();
        Meat freshFish = new FreshFish();
        Grass fishFeed = new FishFeed();
        Grass fruit = new Fruit();
        Grass bamboo = new Bamboo();

        ArrayList<Food> foods = new ArrayList<Food>();
        foods.add(beef);
        foods.add(chicken);
        foods.add(freshFish);
        foods.add(fishFeed);
        foods.add(bamboo);
        foods.add(fruit);

        try {
            for (Animal animal : animals) {
                for (Food food : foods) {
                    worker.feed(food, animal);
                }
            }
        } catch (WrongFoodException e) {
            System.out.println("Пойман эксепшн: " + e);
        }
    }
}
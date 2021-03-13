import java.util.*;

import animals.*;

public class Aviary<T> {

    AviaryType atype;
    boolean forPredators;

    public boolean getStatusAviary() {
        return forPredators;
    }

    public void setForPredators(boolean forPredators) {
        this.forPredators = forPredators;
    }

    public AviaryType getAtype() {
        return atype;
    }

    public void setAtype(AviaryType atype) {
        this.atype = atype;
    }

    public Aviary(AviaryType type) {
        atype = type;
    }


    private Map<String, Animal> animalAviary = new HashMap<>();

    static public void addAnimal(Animal animal, Aviary aviaryType) {

        if (animal.getAtype() == aviaryType.atype) {
            if (aviaryType.animalAviary.isEmpty()) {
                aviaryType.animalAviary.put(animal.getName(), animal);
                System.out.println("Животное помещено в вальер");
                if (animal instanceof Carnivorus) {
                    aviaryType.setForPredators(true);
                } else {
                    aviaryType.setForPredators(false);
                }
            } else {
                if (animal.getAnimalStatus() == aviaryType.forPredators) {
                    aviaryType.animalAviary.put(animal.getName(), animal);
                    System.out.println("Животное помещено в вальер");
                } else {
                    System.out.println("Этот вальер уже занят другим видом животных");
                }
            }
        } else {
            System.out.println("Размер этого вальера не подходит , данному животному!");
        }
    }

    static public void deleteAnimal(Animal animal, Aviary aviaryType) {
        aviaryType.animalAviary.remove(animal.getName());
        System.out.println(animal.getName() + " вышел из вальера...");
    }

    static public void show(Aviary aviary) {
        for (Object key : aviary.animalAviary.keySet()) {
            System.out.println("Сейчас в вальере " + aviary.getAtype());
            System.out.println(key);
        }
    }

    static public void getValue(String value, Aviary aviaryType) {
        System.out.println(aviaryType.animalAviary.get(value));
    }
}
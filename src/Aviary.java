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

    public void addAnimal(Animal animal, Aviary aviaryType) {

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
                }
                else{
                    System.out.println("Этот вальер уже занят другим видом животных");
                }
            }
        } else {
            System.out.println("Размер этого вальера не подходит , данному животному!");
        }
    }



    public void show(Animal a, Aviary b) {
        for (Map.Entry<String, Animal> item : animalAviary.entrySet()) {
            System.out.printf(item.getKey(), item.getValue());
        }
    }


}
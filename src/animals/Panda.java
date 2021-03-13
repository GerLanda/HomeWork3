package animals;

import food.Bamboo;
import food.Food;
import food.Fruit;

public class Panda<AvrialType> extends Herbivorous {

    public Panda(String name, AvrialType type) {
        super(name, type);
    }

    private boolean isAnimalPredator = false;

    public boolean getAnimalStatus() {
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator) {
        this.isAnimalPredator = isAnimalPredator;
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == false && food instanceof Bamboo || food instanceof Fruit) {
            System.out.println("ёу бро , забористый бамбук ты приташил ...");
        } else {
            System.out.println("Эта еда не входит в рацион питания пандарена!");
        }
    }
}


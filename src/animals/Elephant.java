package animals;

import food.Food;
import food.Fruit;

public class Elephant<AvrialType> extends Herbivorous {

    public Elephant(String name, AvrialType type) {
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
    public void eat(Food food) throws WrongFoodException {
        if (food.isMeat() == false && food instanceof Fruit) {
            System.out.println("Слон, любезно машет ушами ....");
        } else {
            System.out.println("Эта еда не входит в рацион питания слона");
        }
    }
}


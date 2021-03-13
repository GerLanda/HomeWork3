package animals;

import food.Beef;
import food.Chicken;
import food.Food;

public class Wolf<AvrialType> extends Carnivorus {

    public Wolf(String name, AvrialType type) {
        super(name, type);
    }

    private boolean isAnimalPredator = true;

    public boolean getAnimalStatus() {
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator) {
        this.isAnimalPredator = isAnimalPredator;
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == true && food instanceof Beef || food instanceof Chicken) {
            System.out.println("Вууууу, свежее мясо ...");
        } else {
            System.out.println("Эта еда не входит в рацион питания волка");
        }
    }
}


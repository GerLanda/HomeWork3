package animals;

import food.Food;
import food.FreshFish;

public class Fish<AvrialType> extends Carnivorus {

    public Fish(String name, AvrialType type) {
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
        if (food.isMeat() == true && food instanceof FreshFish) {
            System.out.println("Рыба быстро подплыла и схватила еду...");
        } else {
            System.out.println("Эта еда не входит в рацион питания рыбы!");
        }
    }
}



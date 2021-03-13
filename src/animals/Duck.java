package animals;

import food.FishFeed;
import food.Food;

public class Duck<AvrialType> extends Herbivorous {

    public Duck(String name, AvrialType type) {
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
        if (food.isMeat() == false && food instanceof FishFeed) {
            System.out.println("Утка, благодарно крякает...");
        } else {
            throw new WrongFoodException("Эта еда не входит в рацион питания утки!");
        }
    }
}


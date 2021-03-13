package animals;

import food.*;

public class Bear<AviaryType> extends Carnivorus {

    public Bear(String name, AviaryType type) {
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
    public void eat(Food food) throws WrongFoodException {
        if (food.isMeat() == true && food instanceof Beef || food instanceof Chicken || food instanceof FreshFish) {
            System.out.println("Медведь кушает..., миша доволен...");
        } else {
            throw new WrongFoodException("Эта еда не входит в рацион питания медведя!");
        }
    }
}




package animals;
import food.Food;

public class Fish<AvrialType> extends Carnivorus {

    public Fish(String name,AvrialType type) {
        super(name,type);
    }

    private boolean isAnimalPredator = true;

    public boolean getAnimalStatus(){
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator){
        this.isAnimalPredator = isAnimalPredator;
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == true) {
            System.out.println("Рыба быстро подплыла и схватила еду...");
        } else {
            System.out.println("Рыба игнорирует, эту еду...");
        }
    }
}



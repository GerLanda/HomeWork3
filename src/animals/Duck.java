package animals;
import food.Food;

public class Duck<AvrialType> extends Herbivorous {

    public Duck(String name,AvrialType type) {
        super(name,type);

    }

    private boolean isAnimalPredator = false;

    public boolean getAnimalStatus(){
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator){
        this.isAnimalPredator = isAnimalPredator;
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == false) {
            System.out.println("Утка, благодарно крякает...");
        } else {
            System.out.println("Утка, посмотрела на еду... и на вас..., снова на еду... , снова на вас...?");
        }
    }
}


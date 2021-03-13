package animals;
import food.Food;

public class Elephant<AvrialType> extends Herbivorous {

    public Elephant(String name,AvrialType type) {

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
            System.out.println("Слон, любезно машет ушами ....");
        } else {
            System.out.println("Слон, недоумевает и топчет ногами, эта еда ему не нравится...");
        }
    }
}


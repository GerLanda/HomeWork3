package animals;
import food.Food;

public class Panda<AvrialType> extends Herbivorous {

    public Panda(String name,AvrialType type) {
        super(name,type);
    }

    private boolean isAnimalPredator = false;

    public boolean getAnimalStatus(){
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator){
        this.isAnimalPredator =isAnimalPredator;
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == false) {
            System.out.println("ёу бро , забористый бамбук ты приташил ...");
        } else {
            System.out.println("ооу неет.., кажется это плохо пахнет.. У тебя нет немного бамбука для меня ...?");
        }
    }
}


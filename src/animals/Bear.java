package animals;

import food.Food;

public class Bear<AviaryType> extends Carnivorus {

    public Bear(String name, AviaryType type) {
        super(name, type);
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
            System.out.println("Медведь кушает..., миша доволен...");
        } else {
            System.out.println("Медведь рычит, кажется эта еда ему не нравится, миша начинает злиться ...");
        }
    }
}




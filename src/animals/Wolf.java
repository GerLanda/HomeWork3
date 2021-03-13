package animals;

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
        if (food.isMeat() == true) {
            System.out.println("Вууууу, свежее мясо ...");
        } else {
            System.out.println("Ты бы мне ещё консервных банок притащил...");
        }
    }
}


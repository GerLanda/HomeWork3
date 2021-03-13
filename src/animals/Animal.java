package animals;

import food.Food;

abstract public class Animal<AvrialType> {

    private String name;
    AvrialType atype;
    private  boolean isAnimalPredator;

    public boolean getAnimalStatus(){
        return isAnimalPredator;
    }

    public void setAnimalStatus(boolean isAnimalPredator){
        this.isAnimalPredator = isAnimalPredator;
    }

    public AvrialType getAtype() {
        return atype;
    }

    public void setAtype(AvrialType atype) {
        this.atype = atype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, AvrialType type) {
        this.name = name;
        atype = type;
    }

    abstract public void eat(Food food);

}

















package animals;

import food.Food;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal<?> animal = (Animal<?>) o;
        return isAnimalPredator == animal.isAnimalPredator && Objects.equals(name, animal.name) && Objects.equals(atype, animal.atype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, atype, isAnimalPredator);
    }
}

















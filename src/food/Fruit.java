package food;

public class Fruit extends Grass{

    public boolean isMeat() {
        return false;
    }

    private String name = "Фрукты";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

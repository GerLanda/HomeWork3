package food;

public class Bamboo extends Grass {

    public boolean isMeat() {
        return false;
    }

    private String name = "Бамбук";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package food;

public class FreshFish extends Meat{
    public boolean isMeat() {
        return true;
    }

    private String name = "Свежая рыба";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

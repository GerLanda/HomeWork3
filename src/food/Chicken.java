package food;

public class Chicken extends Meat{

    public boolean isMeat() {
        return true;
    }

    private String name = "Курица";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

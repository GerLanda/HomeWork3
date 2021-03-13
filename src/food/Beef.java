package food;

public class Beef extends Meat {

    public boolean isMeat() {
        return true;
    }

    private String name = "Говядина";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

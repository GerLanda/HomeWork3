package food;

public class FishFeed extends Grass{

    public boolean isMeat() {
        return false;
    }

    private String name = "Рыбий корм";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

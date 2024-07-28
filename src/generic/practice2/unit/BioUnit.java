package generic.practice2.unit;

public class BioUnit {

    private String name;
    private int hp;

    public BioUnit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}

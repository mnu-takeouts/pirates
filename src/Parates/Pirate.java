package Parates;

/**
 * Created by Danila on 15.02.2017.
 */
public class Pirate {
    int gold;
    String name;

    public Pirate(int gold, String name) {
        this.gold = gold;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" "+gold;
    }
}

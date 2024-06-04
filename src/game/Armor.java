package game;

public class Armor extends Item {
    private int defense;

    public Armor(String name, String description, int defense) {
        super(name, description);
        this.defense = defense;
    }

    public int getDefense() { return defense; }
}
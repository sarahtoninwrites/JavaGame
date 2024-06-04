package game;

public class Character {
    private String name;
    private int level;
    private int health;
    private int strength;
    private int defense;
    private Inventory inventory;

    public Character(String name, int level, int health, int strength, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.inventory = new Inventory();
    }

    public void attack(Character target) {
        int damage = this.strength - target.getDefense();
        target.setHealth(target.getHealth() - damage);
    }

    public String getName() { return name; }
    public int getLevel() { return level; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getStrength() { return strength; }
    public int getDefense() { return defense; }

}

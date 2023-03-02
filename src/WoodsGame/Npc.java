package WoodsGame;

public class Npc extends Enteties {

    //Fields
    private static String Name;
    private static int health = 100;
    private static int damage = 25;

    protected Npc(String name, int health, int damage) {
        super(name, health, damage);
    }

    static Npc Troll1 = new Npc("Trollstein", health, damage);
    static Npc Troll2 = new Npc("Trollvart", health, damage);
    static Npc Troll3 = new Npc("Troll-glenn-tore", health, damage);
    static Npc Troll4 = new Npc("Trollisabeth", health, damage);

    static Npc Npc1 = new Npc("1", health, damage);
    static Npc Npc2 = new Npc("1", health, damage);
    static Npc Npc3 = new Npc("1", health, damage);
    static Npc Npc4 = new Npc("1", health, damage);


    //Getters
    public static String getName() {
        return Name;
    }

    public static int getHealth() {
        return health;
    }

    //Setters
    public static void setName(String name) {
        Name = name;
    }

    public static void setHealth(int health) {
        Npc.health = health;
    }
}

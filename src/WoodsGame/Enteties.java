package WoodsGame;

public abstract class Enteties {

    private String Name;
    private int Health;
    private int Damage;


    protected Enteties(String name, int health, int damage) {
        Name = name;
        Health = health;
        Damage = damage;
    }

}

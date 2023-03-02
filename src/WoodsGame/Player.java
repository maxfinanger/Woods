package WoodsGame;

public class Player extends Enteties {

    private static String Name = StartScreen.Username;
    private static int health = StartScreen.UserHealth;
    private static int damage = StartScreen.UserDamage;

    protected Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    static Player User = new Player(StartScreen.Username, StartScreen.UserHealth, StartScreen.UserDamage);

    @Override
    public String toString() {
        return "Navn: " + StartScreen.Username + "\nHp: " + StartScreen.UserHealth + "\nStyrke: " + StartScreen.UserDamage;
    }

    }


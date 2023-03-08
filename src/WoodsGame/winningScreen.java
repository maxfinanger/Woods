package WoodsGame;

import static WoodsGame.Main.*;

public class winningScreen {

    public winningScreen(String Username) {
        System.out.println("Du har vunnet spillet, Grattis " + Username);
        endGame();
    }
}

package WoodsGame;

import java.util.Scanner;

import static WoodsGame.StartScreen.Username;

public class Main {

    public static void main(String[] args) {
        StartScreen newGame = new StartScreen();
        newGame.StartScreen("");
        Notes.addNotes();
        playGame();

    }

    public static void endGame() {
        System.out.println("Game Over");
        StartScreen newGame = new StartScreen();
    }

    public static void playGame() {
        Scanner MovementInput = new Scanner(System.in);
        Map userPosition = new Map(-0, 0);
        boolean userMovable = true;

        do {
            if (userPosition.y >= 1000 || userPosition.y <= -1000 || userPosition.x >= 1000 || userPosition.x <= -1000 ){
                new winningScreen(Username);
                userMovable = false;
            }
            userPosition.showMapPlacement();
            String movement = MovementInput.nextLine();
            Notes.rollNoteDice();


            int RandomNumber = (int)(Math.random()*50+10);
            int Dice = (int)(Math.random()*6+1);

            if (movement.equals("nord")) {
                userPosition.y += RandomNumber;

            } else if (movement.equals("sør")) {
                userPosition.y -= RandomNumber;

            } else if (movement.equals("øst")) {
                userPosition.x += RandomNumber;

            } else if (movement.equals("vest")) {
                userPosition.x -= RandomNumber;

            } else if (movement.equals("status")){
                System.out.println("\n"+Player.User);
            }
            else if (movement.equals("sekk")){
            System.out.println("\nInnholdet i sekken din er ..");
            }
            else {
                System.out.println("Hmm, best vi kommer oss videre...");
            }

            if (userPosition.y >= 150 && userPosition.y <= 200 && userPosition.x >= -100 && userPosition.x <= 100 ){
                System.out.println("Du har møtt på et stup!");
                movement = MovementInput.nextLine();
                if (movement.equals("nord")) {
                    System.out.println("Du falt ned stupet!");
                    endGame();
                    userMovable = false;
                }
            } else if (userPosition.y >= -300 && userPosition.y <= -200 && userPosition.x >= 100 && userPosition.x <= 250) {
                System.out.println("Det står en bratt fjellvegg foran deg");
                movement = MovementInput.nextLine();
                if (movement.equals("sør") || movement.equals("øst")) {
                    if(Dice >= 4) {
                        System.out.println("Du klatret opp fjellveggen trygt.");
                    }
                    else{
                        System.out.println("Du falt ned fjellsiden.");
                        endGame();
                        userMovable = false;
                    }
                }
            }


        } while (userMovable);
    }
}
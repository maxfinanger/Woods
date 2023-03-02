package WoodsGame;

import java.util.Scanner;

public class StartScreen {

    //Felt
    public static String Username;
    public static int UserHealth = 500;
    public static int UserDamage = 50;

    //Getter
    public String getUsername() {
        return Username;
    }
    public static int getUserHealth() {
        return UserHealth;
    }
    public static int getUserDamage() {
        return UserDamage;
    }

    //Setter
    public void setUsername(String username) {
        Username = username;
    }
    public static void setUserHealth(int userHealth) {
        UserHealth = userHealth;
    }
    public static void setUserDamage(int userDamage) {
        UserDamage = userDamage;
    }

    //Metode
    public void StartScreen(String username) {
        System.out.println("----------------------------------------");
        System.out.println("Velkommen til skogen!");
        System.out.println("");
        System.out.println("Vennligst følg instruksjonen for å starte spillet.");
        System.out.println("I dette spillet må du skrive inn retningen du ønsker å ta deg videre, enten vest, øst, nord eller sør.");
        System.out.println("Utenom hendelser hvor du får beskjed om å velge noe annet.");
        System.out.println("\nMålet ditt er å komme deg trygt ut av skogen.");
        System.out.println("\nDu kan skrive inn STATUS, for å sjekke din status.");
        System.out.println("Du kan også skrive inn SEKK, for å sjekke inholdet i sekken din");
        System.out.println("Lykke til!\n");
        System.out.println("----------------------------------------");
        Scanner usernameScanner = new Scanner(System.in);
        System.out.println("\nSkriv inn ditt navn: ");

        Username = usernameScanner.nextLine();
        System.out.println("\nHei " + Username + ", du våknet nettopp opp i en dyp mørk skog!");

    }




}

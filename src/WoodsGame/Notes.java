package WoodsGame;
import java.util.ArrayList;

public class Notes {

    static ArrayList<String> Note = new ArrayList<>();

    public static void addNotes() {
        Note.add("Hold deg unna fjellsidene! Ikke alle returnerer fra dem!");
        Note.add("... Jeg ser deg!");
        Note.add("du er IKKE alene!");
        Note.add("*Tips Fedora*, Mmmm M´lady!");
        Note.add("Skummel skog UUUUUU");
        Note.add("Kjære " + StartScreen.Username + ", \nDu har faktisk verdens minste penis, teoretikerene har ikke klart å lage modellering for denne mikroskopiske størelsen.\nHilsen, Doktor Reinert");
    }

    public static void rollNoteDice() {
        int noteNumber = (int) (Math.random() * Note.size()+0);
        int noteDice = (int)(Math.random()*6+1);

        if (noteDice == 5) {
            System.out.println("\nDu fant et notat:\n" + Note.get(noteNumber));
        }
    }
}

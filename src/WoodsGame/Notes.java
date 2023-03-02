package WoodsGame;

import java.util.ArrayList;

public class Notes {

    static ArrayList<String> NoteText = new ArrayList<>();

    public Notes() {
        for (int i = 0; i < 30; i++) {
            int RandomXNumber = (int) (Math.random() * 50 + 0);
            int RandomYNumber = (int) (Math.random() * 50 + 0);
            Map note = new Map(RandomXNumber, RandomYNumber);
            NoteText.add(note.toString());
        }

    }
    @Override
    public  String toString() {
        return "";
    };

    public static void main(String[] args) {
        new Notes();
        for (int i=0; i < NoteText.size(); i ++)
        System.out.println(NoteText.get(i));
    }

}

package WoodsGame;

public class Map {

    //Aksene for plassering i kart
    public int x;
    public int y;

    // Konstruktør for Kart
    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters for plassering i kart
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // Setters for plassering i kart
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void showMapPlacement() {
        System.out.println("\nDine koordinater er " + x + " breddegrader, og " + y + " lengdegrader");
        if(x <= 200 && x >= - 200 && y <= 200 && y >= - 200){
            System.out.println("Du er i sentrum");
        }
        else if(x > 200 && y > 200){
            System.out.println("Du er Nord-Øst");
        }
        else if(x < -200 && y > 200){
            System.out.println("Du er Nord-Vest");
        }
        else if(x > 200 && y < -200){
            System.out.println("Du er Sør-Øst");
        }
        else if(x < -200 && y < -200){
            System.out.println("Du er Sør-Vest");
        }
        else if(y > 200){
            System.out.println("Du er Nord");
        }
        else if(y < -200){
            System.out.println("Du er Sør");
        }
        else if(x > 200){
            System.out.println("Du er Øst");
        }
        else if(x < -200){
            System.out.println("Du er Vest");
        }
        }


}

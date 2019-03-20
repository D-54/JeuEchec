package in404.JeuEchec;
import java.util.ArrayList;

public class Plateau {

    private Piece piece;
    static ArrayList<Piece> plateau;

    public Plateau(){
        ArrayList plateau = new ArrayList<Piece>();
    }
    static void addObject(Piece piece){
        plateau.add(piece);
    }
    static void rmObject(Piece piece) {
        plateau.remove(piece);
    }
}

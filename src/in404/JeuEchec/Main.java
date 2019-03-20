package in404.JeuEchec;
import in404.JeuEchec.Plateau;
import java.util.ArrayList;

/**
 * Représente l'application.
 *
 * @version  alpha 0.0
 * @author   Me
 *
 */
enum Main {
    ENVIRONNEMENT;

    /*
     * Méthode principale du programme.
     * @param args void
     */
    public void run(String[] args) {
        ArrayList plateau = new ArrayList<Piece>();
        Piece Fou_1 = new Fou(new Point(1,3),"blanc","Fou_1");
        Plateau p1 = new Plateau();
        plateau.add(Fou_1);
        Point point = new Point(5,4);
        Fou_1.movePiece(point);
        System.out.println(Fou_1);
    }

    /*
     * Point d'entrée du programme.
     * @param args void
     */
    public static void main(String[] args) {
        ENVIRONNEMENT.run(args);
    }
}
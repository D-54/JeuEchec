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

        Plateau plateau = new Plateau();
        Piece Roi_1 = new Roi(new Point(1,6),"blanc","Roi1");
        plateau.addPiece(Roi_1);
        System.out.println(Roi_1);
    }

    /*
     * Point d'entrée du programme.
     * @param args void
     */
    public static void main(String[] args) {
        ENVIRONNEMENT.run(args);
    }
}
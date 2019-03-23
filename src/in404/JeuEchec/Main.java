package in404.JeuEchec;
import java.util.Scanner;
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

        //Initialisation du plateau
        Plateau p1 = new Plateau();
        Piece fou1 = new Fou(new Point(4,5),"Blanc","Fou1");
        Piece tour1 = new Tour(new Point(5,5),"Noir","Tour1");

        p1.addPiece(fou1);
        p1.addPiece(tour1);

        p1.Afficher();

        //Lecture du clavier
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir les coordonnées:");
        String str = sc.nextLine();
        int x = str.charAt(0);
        int y = str.charAt(1);
        System.out.println(p1.setPiece(x-'a',y-'0'));


    }

    /*
     * Point d'entrée du programme.
     * @param args void
     */
    public static void main(String[] args) {
        ENVIRONNEMENT.run(args);
    }
}
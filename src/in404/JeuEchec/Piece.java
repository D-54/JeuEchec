package in404.JeuEchec;
import java.util.ArrayList;

public abstract class Piece {

    /* Les coordonnées de la pièce */
    private Point point;

    /* La couleur de l'équipe de la pièce (ne change pas->constante) */
    private final String couleur;

    /* Le tableau qui contient l'ensemble des déplacements possible d'une pièce */
    private ArrayList<Point> move;

    /**
     * Constructeur de la classe type Piece
     * @param point coordonnées ou se situe la Piece
     * @param couleur couleur de la Piece
     */
    public Piece(Point point, String couleur) {
        this.point = point;
        this.couleur = couleur;
        move = new ArrayList<Point>();
    }

    /**
     * Redéfinition de méthode toString
     * @return le nom de chaque sous classe soit le Fou,Cavalier,Roi,Reine,Tour.
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Ajoute une coordonnée possible de déplacement d'une pièce
     * @param point coordonnées possible pour une pièce
     */
    public void addObject(Point point){
        move.add(point);
    }

    /**
     * Recherche si les coordonnées cible est dans le tableau des déplacements possible
     * @param point Les coordonnées de la cible
     * @return booléens si dans le tableau des déplacements possible
     */
    public boolean SearchObject(Point point){
        return true;
    }

    /**
     * Donne l'ensemble des déplacement possible pour une pièce
     * @return l'ensemble des coordonées, to string définie dans la fonction Point
     */
    public ArrayList<Point> getArray(){
        return move;
    }

    /**
     * Recherche si c'est possble de mettre un point à cette case donner en argument selon la classe,car chaque classe à un déplacement qu'il lui est propre
     * @param pointPostion le point piece initiale
     * @param pointTarget le point cible
     */
    public abstract boolean movePossible(Point pointPostion,Point pointTarget);

    /**
     * Donne la position de la piece
     * @return la position de la piece
     */
    public Point getPosition(){
        return point;
    }

    /**
     * Donne l'équipe auquelle apartient la pièce
     * @return couleur de la pièce
     */
    public String getCouleur(){
        return couleur;
    }
}

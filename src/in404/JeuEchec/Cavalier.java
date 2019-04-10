package in404.JeuEchec;

public class Cavalier extends Piece {

    /**
     * Constructeur de la Pièce Cavalier
     * @param point coordonnées initiale de pièce
     * @param couleur indique l'équipe auquelle apartient la pièce
     */
    public Cavalier(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return "CAVALI";
    }

    @Override
    public boolean movePossible(Point pointPosition,Point pointTarget){
        if(((pointPosition.getX() +  1 == pointTarget.getX()) && (pointPosition.getY() + 2 == pointTarget.getY())) || ((pointPosition.getX() + 2 == pointTarget.getX()) && (pointPosition.getY() +1 == pointTarget.getY()))){
            return true;
        }
        return false;
    }
}

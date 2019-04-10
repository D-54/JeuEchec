package in404.JeuEchec;

public class Fou extends Piece {

    /**
     * Constructeur de la pièce Fou
     * @param point coordonnées initiale de la pièce
     * @param couleur l'équipe auquelle apartient la pièce
     */
    public Fou(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " FOU  ";
    }

    @Override
    public boolean movePossible(Point pointPosition, Point pointTarget){
        if(Math.abs(pointPosition.getX()-pointTarget.getX()) == Math.abs(pointPosition.getY()-pointTarget.getY())){
            return true;
        }
        return false;
    }
}

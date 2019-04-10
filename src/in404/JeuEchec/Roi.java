package in404.JeuEchec;

public class Roi extends Piece {

    /**
     * Constructeur de la pièce Roi
     * @param point coordonnées initiale de la pièce
     * @param couleur l'équipe auquelle apartient la pièce
     */
    public Roi(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " ROI  ";
    }

   @Override
    public boolean movePossible(Point pointPosition,Point pointTarget){
        if(Math.sqrt(Math.pow(Math.abs(pointPosition.getX()-pointTarget.getX()),2) + Math.pow(Math.abs(pointPosition.getY()-pointTarget.getY()),2)) == 1){
            return true;
        }
        return false;
    }
}

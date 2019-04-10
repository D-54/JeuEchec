package in404.JeuEchec;

public class Tour extends Piece {

    /**
     * Constructeur de la pièce Tour
     * @param point coordonnées initiale de la pièce
     * @param couleur l'équipe auquelle apartient la pièce
     */
    public Tour(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " TOUR ";
    }

    @Override
    public boolean movePossible(Point pointPosition, Point pointTarget) {
        if(pointPosition.getX() == pointTarget.getX() || pointPosition.getY() == pointTarget.getY()){
            addObject(new Point(5,5));
            System.out.println(getArray());
            return true;
        }
        return false;
    }
}

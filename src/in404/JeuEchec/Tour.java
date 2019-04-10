package in404.JeuEchec;

public class Tour extends Piece {

    public Tour(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " TOUR ";
    }

    public boolean movePossible(Point pointPosition, Point pointTarget) {
        if(pointPosition.getX() == pointTarget.getX() || pointPosition.getY() == pointTarget.getY()){
            return true;
        }
        return false;
    }
}

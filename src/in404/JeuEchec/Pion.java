package in404.JeuEchec;

public class Pion extends Piece{

    public Pion(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " PION ";
    }

    public boolean movePossible(Point pointPosition, Point pointTarget){
        if((pointPosition.getY() + 1 == pointPosition.getY()) && (pointPosition.getX() == pointPosition.getX())){
            return true;
        }
        return false;

    }
}

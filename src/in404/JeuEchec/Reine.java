package in404.JeuEchec;

public class Reine extends Piece {

    public Reine(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return "REINE ";
    }

    @Override
    public boolean movePossible(Point pointPosition,Point pointTarget){
        if((pointPosition.getX() == pointTarget.getX() || pointPosition.getY() == pointTarget.getY()) || Math.abs(pointPosition.getX()-pointTarget.getX()) == Math.abs(pointPosition.getY()-pointTarget.getY())){
            return true;
        }
        return false;
    }
}

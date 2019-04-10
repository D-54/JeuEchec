package in404.JeuEchec;

public class Fou extends Piece {

    public Fou(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " FOU  ";
    }

    public boolean movePossible(Point pointPosition, Point pointTarget){
        if(Math.abs(pointPosition.getX()-pointTarget.getX()) == Math.abs(pointPosition.getY()-pointTarget.getY())){
            return true;
        }
        return false;
    }
}

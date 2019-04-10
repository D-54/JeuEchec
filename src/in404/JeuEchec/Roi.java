package in404.JeuEchec;

public class Roi extends Piece {

    public Roi(Point point,String couleur){
        super(point,couleur);
    }

    @Override
    public String toString() {
        return " ROI  ";
    }

    /**
     * Calcul si le déplacement du roi est possible
     * J'utilise la formule de la distance entre deux points sur un plan cartésien (théorème de Pythagor), je n'ai pas très envie de m'embeter à faire des conditions...
     * AB = \sqrt(abs(x_b-x_a)^2 + abs(y_b-y_a)^2)
     * @param pointPosition le point de la position de la piece init
     * @param pointTarget le point cible
     * @return boolean si possible
     */
    public boolean movePossible(Point pointPosition,Point pointTarget){
        if(Math.sqrt(Math.pow(Math.abs(pointPosition.getX()-pointTarget.getX()),2) + Math.pow(Math.abs(pointPosition.getY()-pointTarget.getY()),2)) == 1){
            return true;
        }
        return false;
    }
}

package in404.JeuEchec;

public class Case {

    public enum Element{
        VIDE;
    }

    private Piece piece;

    private Element element;

    /**
     * Initialise une case à vide
     */
    public Case(){
        element = Element.VIDE;
    }

    /**
     * Obtenir une piece
     * @param p la piece
     */
    public void setPiece(Piece p){
        p = piece;
    }
}

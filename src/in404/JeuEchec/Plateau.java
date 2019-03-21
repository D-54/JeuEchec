package in404.JeuEchec;

public class Plateau {

    private Piece piece;
    private Case[][] plateau;

    /**
     * Initialisation du plateau de jeu 8*8 cases
     */
    public Plateau(){
        plateau = new Case[7][7];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                plateau[i][j] = new Case();
            }
        }
    }

    /**
     * Ajoute une piece dans le plateau
     * @param piece la piece à ajouter dans une case.
     */
    public void addPiece(Piece piece){
        plateau[piece.getPosition().getX()][piece.getPosition().getY()].setPiece(piece);
    }
}

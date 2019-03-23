package in404.JeuEchec;

public class Plateau {

    /**Une piece du jeu**/
    private Piece piece;
    /**Plateau du jeu en public**/
    public Piece[][] plateau;

    /**
     * Initialisation du plateau de jeu 8*8 cases
     */
    public Plateau(){
        plateau = new Piece[7][7];
    }

    /**
     * Affiche le plateau en txt
     */
    public void Afficher(){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if(this.plateau[i][j] != null)
                    System.out.print(this.plateau[i][j]);
                else
                    System.out.print("[void]");
            }
            System.out.println(" ");
        }
    }

    /**
     * Ajoute une piece dans le plateau
     * @param piece la piece à ajouter dans une case.
     */
    public void addPiece(Piece piece) {
        this.plateau[piece.getPosition().getX()][piece.getPosition().getY()] = piece;
    }

    public Piece setPiece(int x, int y){
        if(this.plateau[x][y] == null)
            return null;
        return this.plateau[x][y];
    }
}

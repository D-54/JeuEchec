package in404.JeuEchec;

public abstract class Piece {
    public abstract Point getPosition();
    public abstract String getCouleur();
    public abstract String getName();
    public abstract void movePiece(Point point);
}

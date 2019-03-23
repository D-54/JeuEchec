package in404.JeuEchec;

public abstract class Piece extends Plateau {
    public abstract void movePiece(Point point);
    public abstract Point getPosition();

    @Override
    public String toString() {
        return super.toString();
    }
}

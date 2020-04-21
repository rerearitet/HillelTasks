package task16;

public class Pawn extends ChessItem {
    public Pawn (boolean isWhite) {
        super("\u2659", 1, isWhite);
        if (!isWhite) this.unicodeCode = "\u265F";
    }
}

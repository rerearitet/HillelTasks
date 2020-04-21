package task16;

public class Rook extends ChessItem {
    public Rook(boolean isWhite) {
        super("\u2656", 3, isWhite);
        if (!isWhite) this.unicodeCode = "\u265C";
    }
}

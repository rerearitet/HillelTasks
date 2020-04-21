package task16;

public class Bishop extends ChessItem {
    public Bishop(boolean isWhite) {
        super("\u2657", 5, isWhite);
        if (!isWhite) this.unicodeCode = "\u265D";
    }
}

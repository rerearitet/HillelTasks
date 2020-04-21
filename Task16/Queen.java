package task16;

public class Queen extends ChessItem {
    public Queen(boolean isWhite) {
        super("\u2655", 9, isWhite);
        if (!isWhite) this.unicodeCode = "\u265B";
    }
}

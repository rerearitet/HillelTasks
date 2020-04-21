package task16;

public class Knight extends ChessItem {
    public Knight(boolean isWhite) {
        super("\u2658", 3, isWhite);
        if (!isWhite) this.unicodeCode = "\u265E";
    }
}

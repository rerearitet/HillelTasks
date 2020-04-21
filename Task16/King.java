package task16;

public class King extends ChessItem {
    public King(boolean isWhite) {
        super("\u2654", Integer.MAX_VALUE, isWhite);
        if (!isWhite) this.unicodeCode = "\u265A";
    }
}

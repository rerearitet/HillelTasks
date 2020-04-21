package task16;

public class ChessItem {
    private int cost;
    String unicodeCode;
    private boolean isWhite;
    public ChessItem (String unicodeCode, int cost, boolean isWhite) {
        this.unicodeCode = unicodeCode;
        this.cost = cost;
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String toString() {
        return unicodeCode;
    }
}

package task16;

public class Main {
    public static void main(String[] args) {
        ChessItem[][] chessBoard = fillChessBoard();
        drawChessBoard(chessBoard);
    }

    public static ChessItem[][] fillChessBoard() {
        ChessItem[][] chessBoard = new ChessItem[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            chessBoard[i][1] = new Pawn(true);
            chessBoard[i][6] = new Pawn(false);
        }

        chessBoard[0][0] = chessBoard[7][0] = new Rook(true);
        chessBoard[0][7] = chessBoard[7][7] = new Rook(false);

        chessBoard[1][0] = chessBoard[6][0] = new Knight(true);
        chessBoard[1][7] = chessBoard[6][7] = new Knight(false);

        chessBoard[2][0] = chessBoard[5][0] = new Bishop(true);
        chessBoard[2][7] = chessBoard[5][7] = new Bishop(false);

        chessBoard[3][0] = new Queen(true);
        chessBoard[4][7] = new Queen(false);

        chessBoard[4][0] = new King(true);
        chessBoard[3][7] = new King(false);

        return chessBoard;
    }

    public static void drawChessBoard(ChessItem[][] chessBoard) {
        int l = 0;
        System.out.print("   ");
        for (int i = 0; i < chessBoard.length; i++) System.out.print(i + "  ");
        System.out.println();
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print(l++ + "  ");
            for (int j = 0; j < chessBoard.length; j++) {
                try {
                    System.out.print(chessBoard[j][i].toString() + " ");
                } catch (Exception e) {
                    System.out.print("   ");
                    continue;
                }
            }
            System.out.println();
        }
    }
}

package application;

import chess.ChessMatch;gi

public class Main {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPiece());
    }
}
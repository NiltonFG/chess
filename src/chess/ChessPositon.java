package chess;

import boardgame.Position;

public class ChessPositon {

    private int row;
    private char column;

    public ChessPositon(int row, char column) {
        if (row < 1 || row > 8 || column < 'a' || column > 'h') {
            throw new ChessException("Error instantiating CheesPosition");
        }
        this.row = row;
        this.column = column;
    }

    protected static ChessPositon fromPosition(Position position) {
        return new ChessPositon(8 - position.getRow(), (char) ('a' - position.getColumn()));
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    protected Position toPositon() {
        return new Position(8 - row, column - 'a');
    }

    @Override
    public String toString() {
        return "" +
                row +
                column;
    }
}
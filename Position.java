/**
 * Created by braij on 5/4/2017.
 */
public class Position {

    private int row;
    private int column;

    protected Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // Overloaded Constructor
    public Position() { this(ChessBoard.firstFreePosition().getRow(), ChessBoard.firstFreePosition().getColumn()); }

    // Getters
    protected int getRow() { return this.row; }
    protected int getColumn() { return this.column; }

    // Return Position details
    public String toString() {
        return getClass().getName() + ":\n\tROW - " + this.row + "\n\tCOLUMN - " + this.column;
    }

}

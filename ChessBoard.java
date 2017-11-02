import java.util.ArrayList;
import java.util.List;

/**
 * Created by braij on 5/4/2017.
 */
public class ChessBoard {

    // Instance Fields
    private static List<ArrayList<Piece>> board;  // Board position / layout (2D - ArrayList)

    // Default Constructor
    public ChessBoard() {
        this.board = new ArrayList<ArrayList<Piece>>();
        setBoard();
    }


    // Overloaded Constructor
    public ChessBoard(List<ArrayList<Piece>> board) { this.board = board; }

    // Getters
    protected static List<ArrayList<Piece>> getBoard() { return board; }

    // Update board occupancy accordingly
    protected static String update(Piece piece, int newRow, int newColumn) {
        if(occupied(newRow, newColumn))
            return "(" + newRow + ", " + newColumn + ") is currently occupied by a " + board.get(newRow).get(newColumn);
        board.get(newRow).add(piece);
        return new ChessBoard(board).toString();
    }

    // Check if position is occupied by another piece
    protected static boolean occupied(int row, int column) {
        return board.get(row).get(column) == null;
    }

    // Find and return the first free position on the board (Returned as a position object (row, column) of 2D - Array)
    protected static Position firstFreePosition() {
        for(int row = 0; row < board.size(); row++)
            for(int column = 0; column < board.get(row).size(); column++)
                if(!(board.get(row).get(column) == null))
                    return new Position(row, column);
        return null;
    }

    // Set pieces on board in their default position (load 2D - (board) ARRAY with Piece objects and non-occupied positions with NULL
    protected static void setBoard() {
        for(int row = 0; row < 8; row++) {
            board.add(new ArrayList<Piece>());
            for(int column = 0; column < 8; column++)
                board.get(row).add(null);
        }

        // (1ST) handle pawn creation for both players first
        for(int playerPawns = 0; playerPawns < board.get(1).size(); playerPawns++) {
            new Piece(new Pawn(), new Position(1, playerPawns));
            new Piece("Pawn", new Position(board.size() - 2, playerPawns));
        }

        // (2ND) handle special piece creation for both players
        // create new array of all special pieces
        String[] specialPieces = new String[Piece.getPieceTypes().length - 1];
        int counter = 0;
        for(String type : Piece.getPieceTypes()) {
            if(!(type.equals("Pawn"))) {
                specialPieces[counter] = type;
                counter++;
            }
        }

        // place special pieces on board for both players
        counter = 0;
        while(counter < 8) {
            new Piece(specialPieces[counter], new Position(0, counter));
            counter++;
            if()
        }
    }

    // Return ChessBoard details
    @Override
    public String toString() {
        String boardString = "";
        for(ArrayList<Piece> row : this.board) {
            boardString += "\n";
            for (Piece column : row)
                boardString += column + "\t";
        }
        return boardString;
    }

}

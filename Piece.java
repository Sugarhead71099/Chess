/**
 * Created by braij on 5/4/2017.
 */
public abstract class Piece {

    // Instance Fields
    private Piece type;
    private Position position;
    public static Piece[] pieceTypes = {new Pawn(), new Rook(), new Bishop(), new Knight(), new King(), new Queen()};

    // Default Constructor
    protected Piece(Piece type, Position position) {
        this.type = isType(type) ? type : new Pawn();
        this.position = position;
    }

    // Overloaded Constructor
    public Piece() { this(new Pawn(), ChessBoard.firstFreePosition()); }

    // Getters
    protected Piece getType() { return this.type; }
    protected Position getPosition() { return this.position; }
    protected static Piece[] getPieceTypes() { return pieceTypes; }

    // Accessor Getters
    protected int getRow() { return this.position.getRow(); }
    protected int getColumn() { return this.position.getColumn(); }

    // Checks if position (row, column) is occupied - if occupied = false ? piece is moved to desired position
    protected String move(int row, int column) {
        new ChessBoard(ChessBoard.getBoard()).update(this, row, column);
        return new ChessBoard(ChessBoard.getBoard()).toString();
    }

    // Returns true if type given is an existing type in 'pieceType' array : false otherwise
    protected boolean isType(Piece type) {
        for(Piece types : pieceTypes)
            if(types.equals(type))
                return true;
        return false;
    }

    @Override
    public String toString() {
        return this.type.toString();
    }

}

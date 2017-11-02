import java.util.ArrayList;
import java.util.List;

/**
 * Created by braij on 5/5/2017.
 */
public class Player {

    // Instance Fields
    private String name;
    private int numberOfPieces;
    private boolean hasKing;
    private List<Piece> piecesObtained;

    // Default Constructor
    protected Player(String name) {
        this.name = name;
        this.numberOfPieces = 16;
        this.hasKing = true;
        this.piecesObtained = new ArrayList<Piece>();
    }

    // Overloaded Constructor
    public Player() { this("Rookie"); }

    // Getters
    protected String getName() { return this.name; }
    protected int getNumberOfpieces() { return this.numberOfPieces; }
    protected boolean hasKing() { return this.hasKing; }
    protected List<Piece> getPiecesObtained() { return this.piecesObtained; }

    // Return Player details
    public String toString() {
        return getClass().getName() + ":\t" + this.name + " has" + (this.numberOfPieces == 16 ? " all 16 pieces " : this.numberOfPieces + " pieces remaining ") + "and" +
                (this.piecesObtained.size() == 0 ? " hasn't obtained any pieces " : " has obtained " + this.piecesObtained.size() + " pieces ");
    }

}

/**
 * Created by braij on 5/5/2017.
 */
public class GameState {

    // Instance Fields
    private String playerWinning;
    private Player player1;
    private Player player2;

    // Default Constructor
    protected GameState(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Overloaded Constructor
    public GameState() { this(new Player("Player1"), new Player("Player2")); }

    // Getters
    protected String getPlayerWinning() { return this.playerWinning; }

    // Decide and return which player is winning
    protected String updateGameStatus() {
        if(player1.hasKing())
            return player1.getName() + " has won!";
        else if(player2.hasKing())
            return player2.getName() + " has won!";

        if(player1.getPiecesObtained().size() > player2.getPiecesObtained().size())
            this.playerWinning = player1.getName();
        else
            this.playerWinning = player2.getName();
        return this.playerWinning + " is winning";
    }

    // Return GameState Details
    @Override
    public String toString() {
        return playerWinning.equals(player1.getName()) ? player1.getName() + " is in the lead with " + player1.getPiecesObtained() : player2.getName() +
                " is in the lead with " + player2.getPiecesObtained();
    }

}

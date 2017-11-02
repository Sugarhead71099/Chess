/**
 * Created by braij on 5/4/2017.
 */
public class Chess {

    // Instance Fields
    private GameState gameState;    // winning / losing status (After player moves, winning/losing status is updated)
    private ChessBoard chessBoard;  // Holds piece positions
    private Player player1;         // How many pieces does player1 have / has acquired
    private Player player2;         // How many pieces does player2 have / has acquired

    // Default Constructor
    protected Chess(GameState gameState, ChessBoard chessBoard, Player player1, Player player2) {
        this.gameState = gameState;
        this.chessBoard = chessBoard;
        this.player1 = player1;
        this.player2 = player2;
    }

    // Overloaded Constructor
    public Chess() { this(new GameState(), new ChessBoard(), new Player(), new Player()); }

    // Getters
    protected GameState getGameState() { return this.gameState; }
    protected ChessBoard getChessBoard() { return this.chessBoard; }
    protected Player getPlayer1() { return this.player1; }
    protected Player getPlayer2() { return this.player2; }

    // Start the game
    public void play() {
        ChessBoard.setBoard();
    }

    // Return Chess details
    public String toString() {
        return getClass().getName() + ":\t This is a chess game between " + player1.getName() + " and " + player2.getName();
    }

}

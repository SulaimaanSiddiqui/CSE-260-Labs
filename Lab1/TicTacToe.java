import java.util.Scanner;
/**
 * This tictactoe class represents a game of tictac toe
 * The board is represented by a board object
 * 
 */
public class TicTacToe
{
    // instance variables - replace the example below with your own
    private Board b;
    private final String player1 = "X";
    private final String player2 = "O";
    private String currentPlayer;

    /**
     * Constructor for objects of class TicTacToe
     * Initializes a board and a dialogue
     * 
     */
    public TicTacToe()
    {
        b = new Board();
        currentPlayer = player1;
    }

    /**
     * playGame()
     * This method creates a loop in which the player can play tic tac toe
     * The player selects either "X" and "O" and alternates with a randomly generated move
     * The game ends when there are no more spaces or if one player gets his piece three times
     * consecutively
     * 1
     */
    public void playGame()
    {
    	Scanner scan = new Scanner(System.in);

        while(!b.isGameOver()){
        	System.out.println(b);
            System.out.println("Row");
            int row = Integer.parseInt(scan.nextLine());
            System.out.println("Col");
            int col = Integer.parseInt(scan.nextLine());
            if(b.isNotFilled(row-1,col-1))
            	b.makeMove(currentPlayer, row, col);
            else{
                    System.out.println("Move taken");
                    playGame();
                }
            if(currentPlayer.equals(player1))
            	currentPlayer = player2;
            else
            	currentPlayer = player1;
        }
        printWinner();
    }

    

    /**
     * printWinner()
     * prints the winner of the game
     * 
     */
    public void printWinner()
    {
        System.out.println(b.getWinner());
    }
    
    /**
     * printWinner()
     * prints the winner of the game
     * 
     */
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
       game.playGame();   
    }
}
import java.util.ArrayList;
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    private String[][] board;
    private String winner;
    public static final int DIM = 3;
    //private boolean isAllFilled;

    /**
     * Constructor for objects of class Board
     * Creates a blank 3x3 board and populates is with strings of " "
     * 
     */
    public Board()
    {
        board = new String[3][3];
        //isAllFilled = false;
        for(int i = 0; i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                board[i][j] = " ";
            }
        }
    }

    /**
     * makeMove method
     * Allows the client to mutate one of the positions in the board
     * with a string x
     * Cannot work if the position is filled with anything other than ""
     * 
     * @param  x   string to replace " "
     *         row   the desired row position, should be from 1-3
     *         col 	 the desired row position, should be from 1-3
     */
    public void makeMove(String x, int row, int col) throws IllegalArgumentException
    {
        if(row>0 && row<4 &&col>0 &&col<4){
        	if(board[row-1][col-1].equals(" "))
        		board[row-1][col-1] = x;
        }
        else throw new IllegalArgumentException();
    }

    /**
     * toString method
     * Gives us a printable representation of the board
     * 
     * @return String the board 
     */
    public String toString()
    {
        String s = "";
        for(int i = 0; i < board[0].length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                s+= board[i][j];
                if(j == 2 && i!=2)
                    s+="\n--------\n";
                else if(j!=2)
                    s+= "|";
            }
        }
        return s;
    }

    /**
     * main method method
     * used to verify the above two methods
     * 
     * 
     */
    public static void main(String[] args)
    {
        Board b = new Board();
        System.out.println(b);
        //b.makeMove("X",1);
        System.out.println(b);
    }

    public boolean isGameOver()
    {
        if(board[0][0].equals(board[0][1]) && board[0][2].equals(board[0][1]) 
        && !board[0][0].equals(" "))
        {
            winner = board[0][0];
            return true;
        }
        if(board[1][0].equals(board[1][1]) && board[1][2].equals(board[1][0]) 
        && !board[1][0].equals(" "))
        {
            winner = board[1][0];
            return true;
        }
        if(board[2][0].equals(board[2][1]) && board[2][2].equals(board[2][0]) 
        && !board[2][0].equals(" "))
        {
            winner = board[2][0];
            return true;
        }
        if(board[0][0].equals(board[1][0]) && board[2][0].equals(board[0][0])
        && !board[0][0].equals(" "))
        {
            winner = board[0][0];
            return true;
        }
        if(board[0][1].equals(board[1][1]) && board[2][1].equals(board[0][1])
        && !board[0][1].equals(" "))
        {
            winner = board[0][1];;
            return true;
        }
        if(board[0][2].equals(board[1][2]) && board[2][2].equals(board[0][2])
        && !board[0][2].equals(" "))
        {
            winner = board[0][2];
            return true;
        }
        if(board[0][0].equals(board[1][1]) && board[2][2].equals(board[0][0])
        && !board[0][0].equals(" "))
        {
            winner = board[0][0];
            return true;
        }
        if(board[2][0].equals(board[1][1]) && board[0][2].equals(board[2][0])
        && !board[2][0].equals(" "))
        {
            winner = board[2][0];
            return true;
        }
        if(isAllFilled())
        {
            winner = "None";
            return true;
        }
        return false;

    }


    public boolean isNotFilled(int r,int c)
    {
        return board[r][c].equals(" ");
    }

    public boolean isAllFilled()
    {
        for(int i = 0; i < board[0].length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                if(isNotFilled(i,j))
                {
                    return false;
                }
            }
        }      
        return true;
    }

    public String getWinner()
    {
        if(winner.equals("None"))
            return "Tie game";
        return winner + " has won the game";
    }


    
    public String getMove(int row,int col)
    {
        return board[row][col];
    }
}

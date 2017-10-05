import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * This class creates a game of tictactoe. The user and the interface take turns making a move.
 * This class is the gui where a board is implemented
 * 
 * Sulaimaan Siddiqui
 * 01
 */
public class TicTacToeGUI
{
    private Board b;
    private JFrame frame;
    private String userChoice;
    private String otherChoice;
    private boolean hasChosen;

    /**
     * Constructor for objects of class TicTacToeGUI
     */
    public TicTacToeGUI(JFrame frame)
    {
        this.frame = frame;
        b = new Board();  
        hasChosen = false;
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(Board.DIM,Board.DIM));
        frame.getContentPane().add(mainPanel);
        mainPanel.add(panel,BorderLayout.NORTH);
        setChoice(mainPanel);
        setPanels(panel);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This method sets the panels of the main gameboard
     * 
     */
    public void setPanels(JPanel panel)
    {
        int dim = Board.DIM;
        final GamePanel[][] gamePanels = new GamePanel[dim][dim];        
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {

                gamePanels[i][j] = new GamePanel(i,j);
                GamePanel gamePanel = gamePanels[i][j];
                final int r = i;
                final int c = j;
                ActionListener move = new ActionListener()                
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            move(r, c, gamePanels);
                        }

                    };
                gamePanel.addActionListener(move); 
                panel.add(gamePanel);
            }
        }
    }

    public void setChoice(JPanel mainPanel)
    {
        JPanel choice  = new JPanel();
        choice.setLayout(new GridLayout(1,2));
        mainPanel.add(choice, BorderLayout.SOUTH);
        final JButton XButton = new JButton("X");
        final JButton OButton = new JButton("O");
        ActionListener ochoice = new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    userChoice = "O";
                    otherChoice = "X";
                    endButton(XButton,OButton);
                }

            };
        OButton.addActionListener(ochoice);
        ActionListener xchoice = new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    userChoice = "X";
                    otherChoice = "O";
                    endButton(XButton,OButton);
                }

            };
        XButton.addActionListener(xchoice);
        choice.add(XButton);
        choice.add(OButton);
    }

    public int toPos(int row, int col)
    {
        return row*Board.DIM+col%Board.DIM+1;
    }

    public void move(int row, int col, GamePanel[][] gamePanels)
    {
        if(hasChosen){
            try
            {
                b.makeMove(userChoice, toPos(row,col));
                gamePanels[row][col].setText(userChoice);
                gamePanels[row][col].setEnabled(false);
                frame.pack();
                if(b.isGameOver())
                    endGame(gamePanels);
                else
                {
                    randomMove(gamePanels);                
                    if(b.isGameOver())
                    {
                        endGame(gamePanels);
                    }
                }
            }
            catch(IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(frame, "Move invalid");
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Pick a piece");
    }

    public void endButton(JButton XButton, JButton OButton)
    {
        XButton.setText("");
        OButton.setText("");
        XButton.setEnabled(false);
        OButton.setEnabled(false);
        hasChosen = true;
    }

    public int[] fromPos(int i)
    {
        int[] coor = new int[2];
        coor[0] = (i-1)/Board.DIM;
        coor[1] = (i-1)%Board.DIM;
        return coor;
    }

    public void endGame(GamePanel[][] gamePanels)
    {
        JOptionPane.showMessageDialog(frame, "Game Over: " + b.getWinner());
        for(GamePanel[] g: gamePanels)
            for(GamePanel p: g)
                p.setEnabled(false);
        
    }

    /**
     * RandomMove()
     * makes a random move to oppose the players' move 
     * Uses math.random
     */
    public void randomMove(GamePanel[][] gamePanels)
    {
        int move = -1;
        do
        {
            move = (int)(Math.random()*9+1);
        }while(!b.isNotFilled(move));
        b.makeMove(otherChoice, move);
        int[] coor = fromPos(move);
        gamePanels[coor[0]][coor[1]].setText(otherChoice);
        gamePanels[coor[0]][coor[1]].setEnabled(false);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        TicTacToeGUI gui = new TicTacToeGUI(frame);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
  JPanel piecePanel;
  private ImageIcon red_cannon = new ImageIcon("red_cannon.png");
  public MyFrame (){
    this.setTitle("Janggi Game");
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    this.setResizable(false);
    this.setSize(800,620);

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0,0,540,600);
    

    piecePanel = new JPanel();

    piecePanel.setSize(540, 600);

    piecePanel.setOpaque(false);
    
    piecePanel.setLayout(new GridLayout(10,9,0,0));

    /*for(int i = 0; i < 90; i++)
      {
        boardPanel.add(new JLabel(new ImageIcon("green_cannon.png")));
      }*/


    for (int r = 0; r < 10; r++)
    {
      for (int c = 0; c < 9; c++)
      {
        JLabel temp = new JLabel();
        if (Board.getPiece(r, c) == null)
        {
          temp.setVisible(false);
        }
        else if (Board.getPiece(r, c).getTeam() == true)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("green_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
        else if (Board.getPiece(r, c).getTeam() == false)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            temp.setIcon(new ImageIcon(new ImageIcon("red_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
        piecePanel.add(temp);
      }
    }
    /*
    for(int i = 0; i < 90; i++)
    {
      JLabel temp = new JLabel();
      temp.setIcon(new ImageIcon(red_cannon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
      piecePanel.add(temp);  
    } 
    */
  

    JLabel label = new JLabel();
    label.setBounds(0, 0, 540, 600);
    ImageIcon board = new ImageIcon("Janggi Board.png");
    label.setIcon(new ImageIcon(board.getImage().getScaledInstance(540, 600, Image.SCALE_DEFAULT)));
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.LEFT);
    //this.add(label);

    //this.add(boardPanel);

    layeredPane.add(piecePanel);
    layeredPane.add(label);

    this.add(layeredPane);
    
    


    ImageIcon image = new ImageIcon("remy2.jpg");
    this.setIconImage(image.getImage());
    piecePanel.setVisible(true);
    this.setVisible(true);

  }


}
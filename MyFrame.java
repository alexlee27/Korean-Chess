import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener
{
  static JLabel[][] graphicalPieces = new JLabel[10][9];
  JLabel place1 = new JLabel();
  JLabel place2 = new JLabel();
  JLabel place3 = new JLabel();
  JLabel place4 = new JLabel();
  JLabel place5 = new JLabel();
  JLabel place6 = new JLabel();
  JLabel place7 = new JLabel();
  JLabel place8 = new JLabel();
  JLabel place9 = new JLabel();
  JLabel place10 = new JLabel();
  JLabel place11 = new JLabel();
  JLabel place12 = new JLabel();
  JLabel place13 = new JLabel();
  JLabel place14 = new JLabel();
  JLabel place15 = new JLabel();
  JLabel place16 = new JLabel();
  JLabel place17 = new JLabel();
  JLabel place18 = new JLabel();
  JLabel place19 = new JLabel();
  JLabel place20 = new JLabel();
  JLabel place21 = new JLabel();
  JLabel place22 = new JLabel();
  JLabel place23 = new JLabel();
  JLabel place24 = new JLabel();
  JLabel place25 = new JLabel();
  JLabel place26 = new JLabel();
  JLabel place27 = new JLabel();
  JLabel place28 = new JLabel();
  JLabel place29 = new JLabel();
  JLabel place30 = new JLabel();
  JLabel place31 = new JLabel();
  JLabel place32 = new JLabel();
  JLabel place33 = new JLabel();
  JLabel place34 = new JLabel();
  JLabel place35 = new JLabel();
  JLabel place36 = new JLabel();
  JLabel place37 = new JLabel();
  JLabel place38 = new JLabel();
  JLabel place39 = new JLabel();
  JLabel place40 = new JLabel();
  JLabel place41 = new JLabel();
  JLabel place42 = new JLabel();
  JLabel place43 = new JLabel();
  JLabel place44 = new JLabel();
  JLabel place45 = new JLabel();
  JLabel place46 = new JLabel();
  JLabel place47 = new JLabel();
  JLabel place48 = new JLabel();
  JLabel place49 = new JLabel();
  JLabel place50 = new JLabel();
  JLabel place51 = new JLabel();
  JLabel place52 = new JLabel();
  JLabel place53 = new JLabel();
  JLabel place54 = new JLabel();
  JLabel place55 = new JLabel();
  JLabel place56 = new JLabel();
  JLabel place57 = new JLabel();
  JLabel place58 = new JLabel();
  JLabel place59 = new JLabel();
  JLabel place60 = new JLabel();
  JLabel place61 = new JLabel();
  JLabel place62 = new JLabel();
  JLabel place63 = new JLabel();
  JLabel place64 = new JLabel();
  JLabel place65 = new JLabel();
  JLabel place66 = new JLabel();
  JLabel place67 = new JLabel();
  JLabel place68 = new JLabel();
  JLabel place69 = new JLabel();
  JLabel place70 = new JLabel();
  JLabel place71 = new JLabel();
  JLabel place72 = new JLabel();
  JLabel place73 = new JLabel();
  JLabel place74 = new JLabel();
  JLabel place75 = new JLabel();
  JLabel place76 = new JLabel();
  JLabel place77 = new JLabel();
  JLabel place78 = new JLabel();
  JLabel place79 = new JLabel();
  JLabel place80 = new JLabel();
  JLabel place81 = new JLabel();
  JLabel place82 = new JLabel();
  JLabel place83 = new JLabel();
  JLabel place84 = new JLabel();
  JLabel place85 = new JLabel();
  JLabel place86 = new JLabel();
  JLabel place87 = new JLabel();
  JLabel place88 = new JLabel();
  JLabel place89 = new JLabel();
  JLabel place90 = new JLabel();
  JPanel piecePanel;

  private int row = -2;
  private int column = -2; 

  //CONSTRUCTOR
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


    graphicalPieces[0][0] = place1;
    graphicalPieces[0][1] = place2;
    graphicalPieces[0][2] = place3;
    graphicalPieces[0][3] = place4;
    graphicalPieces[0][4] = place5;
    graphicalPieces[0][5] = place6;
    graphicalPieces[0][6] = place7;
    graphicalPieces[0][7] = place8;
    graphicalPieces[0][8] = place9;

    graphicalPieces[1][0] = place10;
    graphicalPieces[1][1] = place11;
    graphicalPieces[1][2] = place12;
    graphicalPieces[1][3] = place13;
    graphicalPieces[1][4] = place14;
    graphicalPieces[1][5] = place15;
    graphicalPieces[1][6] = place16;
    graphicalPieces[1][7] = place17;
    graphicalPieces[1][8] = place18;

    graphicalPieces[2][0] = place19;
    graphicalPieces[2][1] = place20;
    graphicalPieces[2][2] = place21;
    graphicalPieces[2][3] = place22;
    graphicalPieces[2][4] = place23;
    graphicalPieces[2][5] = place24;
    graphicalPieces[2][6] = place25;
    graphicalPieces[2][7] = place26;
    graphicalPieces[2][8] = place27;

    graphicalPieces[3][0] = place28;
    graphicalPieces[3][1] = place29;
    graphicalPieces[3][2] = place30;
    graphicalPieces[3][3] = place31;
    graphicalPieces[3][4] = place32;
    graphicalPieces[3][5] = place33;
    graphicalPieces[3][6] = place34;
    graphicalPieces[3][7] = place35;
    graphicalPieces[3][8] = place36;

    graphicalPieces[4][0] = place37;
    graphicalPieces[4][1] = place38;
    graphicalPieces[4][2] = place39;
    graphicalPieces[4][3] = place40;
    graphicalPieces[4][4] = place41;
    graphicalPieces[4][5] = place42;
    graphicalPieces[4][6] = place43;
    graphicalPieces[4][7] = place44;
    graphicalPieces[4][8] = place45;

    graphicalPieces[5][0] = place46;
    graphicalPieces[5][1] = place47;
    graphicalPieces[5][2] = place48;
    graphicalPieces[5][3] = place49;
    graphicalPieces[5][4] = place50;
    graphicalPieces[5][5] = place51;
    graphicalPieces[5][6] = place52;
    graphicalPieces[5][7] = place53;
    graphicalPieces[5][8] = place54;
    
    graphicalPieces[6][0] = place55;
    graphicalPieces[6][1] = place56;
    graphicalPieces[6][2] = place57;
    graphicalPieces[6][3] = place58;
    graphicalPieces[6][4] = place59;
    graphicalPieces[6][5] = place60;
    graphicalPieces[6][6] = place61;
    graphicalPieces[6][7] = place62;
    graphicalPieces[6][8] = place63;

    graphicalPieces[7][0] = place64;
    graphicalPieces[7][1] = place65;
    graphicalPieces[7][2] = place66;
    graphicalPieces[7][3] = place67;
    graphicalPieces[7][4] = place68;
    graphicalPieces[7][5] = place69;
    graphicalPieces[7][6] = place70;
    graphicalPieces[7][7] = place71;
    graphicalPieces[7][8] = place72;

    graphicalPieces[8][0] = place73;
    graphicalPieces[8][1] = place74;
    graphicalPieces[8][2] = place75;
    graphicalPieces[8][3] = place76;
    graphicalPieces[8][4] = place77;
    graphicalPieces[8][5] = place78;
    graphicalPieces[8][6] = place79;
    graphicalPieces[8][7] = place80;
    graphicalPieces[8][8] = place81;

    graphicalPieces[9][0] = place82;
    graphicalPieces[9][1] = place83;
    graphicalPieces[9][2] = place84;
    graphicalPieces[9][3] = place85;
    graphicalPieces[9][4] = place86;
    graphicalPieces[9][5] = place87;
    graphicalPieces[9][6] = place88;
    graphicalPieces[9][7] = place89;
    graphicalPieces[9][8] = place90;

    for(int r = 0; r < 10; r++)
    {
      for(int c = 0; c < 9; c++)
      {
        piecePanel.add(graphicalPieces[r][c]);
        graphicalPieces[r][c].addMouseListener(this);
      }
    }

  

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
  //END OF CONSTRUCTOR
  

  public static void printAllPieces()
  {
    for (int r = 0; r < 10; r++)
    {
      for (int c = 0; c < 9; c++)
      {
        if (Board.getPiece(r, c) == null)
        {
          graphicalPieces[r][c].setVisible(false);
        }
        else if (Board.getPiece(r, c).getTeam() == true)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
        else if (Board.getPiece(r, c).getTeam() == false)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            graphicalPieces[r][c].setVisible(true);
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
      }
    }
  }

  public static void updateMovedPieces(int r1, int c1, int r2, int c2)
  {
    graphicalPieces[r2][c2].setVisible(true);
    graphicalPieces[r2][c2].setIcon(graphicalPieces[r1][c1].getIcon());
    graphicalPieces[r1][c1].setVisible(false);
  }

  
  public int getRow()
  {
    return row;
  }

  public int getColumn()
  {
    return column;
  }

  public void cleanCoordinates()
  {
    row = -2;
    column = -2;
  }

  
  public void mouseClicked(MouseEvent e)
  {
    if(e.getSource() == place1)
    {
      row = 0;
      column = 0;
      System.out.println("place 1 clicked");
    }
    else if (e.getSource() == place2)
    {
      
    }
    else if (e.getSource() == place3)
    {
      
    }
    else if (e.getSource() == place4)
    {
      
    }
    else if (e.getSource() == place5)
    {
      
    }
    else if (e.getSource() == place6)
    {
      
    }
    else if (e.getSource() == place7)
    {
      
    }
    else if (e.getSource() == place8)
    {
      
    }
    else if (e.getSource() == place9)
    {
      
    }
    else if (e.getSource() == place10)
    {
      row = 1;
      column = 0;
      System.out.println("place 10 clicked");
    }
    else if (e.getSource() == place11)
    {
      
    }
    else if (e.getSource() == place12)
    {
      
    }
    else if (e.getSource() == place13)
    {
      
    }
    else if (e.getSource() == place14)
    {
      
    }
    else if (e.getSource() == place15)
    {
      
    }
    else if (e.getSource() == place16)
    {
      
    }
    else if (e.getSource() == place17)
    {
      
    }
    else if (e.getSource() == place18)
    {
      
    }
    else if (e.getSource() == place19)
    {
      
    }
    else if (e.getSource() == place20)
    {
      
    }
    else if (e.getSource() == place21)
    {
      
    }
    else if (e.getSource() == place22)
    {
      
    }
    else if (e.getSource() == place23)
    {
      
    }
    else if (e.getSource() == place24)
    {
      
    }
    else if (e.getSource() == place25)
    {
      
    }
    else if (e.getSource() == place26)
    {
      
    }
    else if (e.getSource() == place27)
    {
      
    }
    else if (e.getSource() == place28)
    {
      
    }
    else if (e.getSource() == place29)
    {
      
    }
    else if (e.getSource() == place30)
    {
      
    }
    else if (e.getSource() == place31)
    {
      
    }
    else if (e.getSource() == place32)
    {
      
    }
    else if (e.getSource() == place33)
    {
      
    }
    else if (e.getSource() == place34)
    {
      
    }
    else if (e.getSource() == place35)
    {
      
    }
    else if (e.getSource() == place36)
    {
      
    }
    else if (e.getSource() == place37)
    {
      
    }
    else if (e.getSource() == place38)
    {
      
    }
    else if (e.getSource() == place39)
    {
      
    }
    else if (e.getSource() == place40)
    {
      
    }
    else if (e.getSource() == place41)
    {
      
    }
    else if (e.getSource() == place42)
    {
      
    }
    else if (e.getSource() == place43)
    {
      
    }
    else if (e.getSource() == place44)
    {
      
    }
    else if (e.getSource() == place45)
    {
      
    }
    else if (e.getSource() == place46)
    {
      
    }
    else if (e.getSource() == place47)
    {
      
    }
    else if (e.getSource() == place48)
    {
      
    }
    else if (e.getSource() == place49)
    {
      
    }
    else if (e.getSource() == place50)
    {
      
    }
    else if (e.getSource() == place51)
    {
      
    }
    else if (e.getSource() == place52)
    {
      
    }
    else if (e.getSource() == place53)
    {
      
    }
    else if (e.getSource() == place54)
    {
      
    }
    else if (e.getSource() == place55)
    {
      row = 6;
      column = 0;
      System.out.println("place 55 clicked");
    }
    else if (e.getSource() == place56)
    {
      row = 6;
      column = 1;
      System.out.println("place 56 clicked");
    }
    else if (e.getSource() == place57)
    {
      
    }
    else if (e.getSource() == place58)
    {
      
    }
    else if (e.getSource() == place59)
    {
      
    }
    else if (e.getSource() == place60)
    {
      
    }
    else if (e.getSource() == place61)
    {
      
    }
    else if (e.getSource() == place62)
    {
      
    }
    else if (e.getSource() == place63)
    {
      
    }
    else if (e.getSource() == place64)
    {
      
    }
    else if (e.getSource() == place65)
    {
      
    }
    else if (e.getSource() == place66)
    {
      
    }
    else if (e.getSource() == place67)
    {
      
    }
    else if (e.getSource() == place68)
    {
      
    }
    else if (e.getSource() == place69)
    {
      
    }
    else if (e.getSource() == place70)
    {
      
    }
    else if (e.getSource() == place71)
    {
      
    }
    else if (e.getSource() == place72)
    {
      
    }
    else if (e.getSource() == place73)
    {
      
    }
    else if (e.getSource() == place74)
    {
      
    }
    else if (e.getSource() == place75)
    {
      
    }
    else if (e.getSource() == place76)
    {
      
    }
    else if (e.getSource() == place77)
    {
      
    }
    else if (e.getSource() == place78)
    {
      
    }
    else if (e.getSource() == place70)
    {
      
    }
    else if (e.getSource() == place80)
    {
      
    }
    else if (e.getSource() == place81)
    {
      
    }
    else if (e.getSource() == place82)
    {
      
    }
    else if (e.getSource() == place83)
    {
      
    }
    else if (e.getSource() == place84)
    {
      
    }
    else if (e.getSource() == place85)
    {
      
    }
    else if (e.getSource() == place86)
    {
      
    }
    else if (e.getSource() == place87)
    {
      
    }
    else if (e.getSource() == place88)
    {
      
    }
    else if (e.getSource() == place89)
    {
      
    }
    else if (e.getSource() == place90)
    {
      
    }
    
  }
  public void mouseEntered(MouseEvent e)
  {
    
  }

  public void mousePressed(MouseEvent e)
  {
    
  }
  public void mouseReleased(MouseEvent e)
  {

  }
  public void mouseExited(MouseEvent e)
  {
    
  }
}
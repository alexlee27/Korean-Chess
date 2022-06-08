import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener
{
  static JLabel[][] graphicalPieces = new JLabel[10][9];
  static JLabel[][] greyCircles = new JLabel[10][9];
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

  JLabel greyCircle1 = new JLabel();
  JLabel greyCircle2 = new JLabel();
  JLabel greyCircle3 = new JLabel();
  JLabel greyCircle4 = new JLabel();
  JLabel greyCircle5 = new JLabel();
  JLabel greyCircle6 = new JLabel();
  JLabel greyCircle7 = new JLabel();
  JLabel greyCircle8 = new JLabel();
  JLabel greyCircle9 = new JLabel();
  JLabel greyCircle10 = new JLabel();
  JLabel greyCircle11 = new JLabel();
  JLabel greyCircle12 = new JLabel();
  JLabel greyCircle13 = new JLabel();
  JLabel greyCircle14 = new JLabel();
  JLabel greyCircle15 = new JLabel();
  JLabel greyCircle16 = new JLabel();
  JLabel greyCircle17 = new JLabel();
  JLabel greyCircle18 = new JLabel();
  JLabel greyCircle19 = new JLabel();
  JLabel greyCircle20 = new JLabel();
  JLabel greyCircle21 = new JLabel();
  JLabel greyCircle22 = new JLabel();
  JLabel greyCircle23 = new JLabel();
  JLabel greyCircle24 = new JLabel();
  JLabel greyCircle25 = new JLabel();
  JLabel greyCircle26 = new JLabel();
  JLabel greyCircle27 = new JLabel();
  JLabel greyCircle28 = new JLabel();
  JLabel greyCircle29 = new JLabel();
  JLabel greyCircle30 = new JLabel();
  JLabel greyCircle31 = new JLabel();
  JLabel greyCircle32 = new JLabel();
  JLabel greyCircle33 = new JLabel();
  JLabel greyCircle34 = new JLabel();
  JLabel greyCircle35 = new JLabel();
  JLabel greyCircle36 = new JLabel();
  JLabel greyCircle37 = new JLabel();
  JLabel greyCircle38 = new JLabel();
  JLabel greyCircle39 = new JLabel();
  JLabel greyCircle40 = new JLabel();
  JLabel greyCircle41 = new JLabel();
  JLabel greyCircle42 = new JLabel();
  JLabel greyCircle43 = new JLabel();
  JLabel greyCircle44 = new JLabel();
  JLabel greyCircle45 = new JLabel();
  JLabel greyCircle46 = new JLabel();
  JLabel greyCircle47 = new JLabel();
  JLabel greyCircle48 = new JLabel();
  JLabel greyCircle49 = new JLabel();
  JLabel greyCircle50 = new JLabel();
  JLabel greyCircle51 = new JLabel();
  JLabel greyCircle52 = new JLabel();
  JLabel greyCircle53 = new JLabel();
  JLabel greyCircle54 = new JLabel();
  JLabel greyCircle55 = new JLabel();
  JLabel greyCircle56 = new JLabel();
  JLabel greyCircle57 = new JLabel();
  JLabel greyCircle58 = new JLabel();
  JLabel greyCircle59 = new JLabel();
  JLabel greyCircle60 = new JLabel();
  JLabel greyCircle61 = new JLabel();
  JLabel greyCircle62 = new JLabel();
  JLabel greyCircle63 = new JLabel();
  JLabel greyCircle64 = new JLabel();
  JLabel greyCircle65 = new JLabel();
  JLabel greyCircle66 = new JLabel();
  JLabel greyCircle67 = new JLabel();
  JLabel greyCircle68 = new JLabel();
  JLabel greyCircle69 = new JLabel();
  JLabel greyCircle70 = new JLabel();
  JLabel greyCircle71 = new JLabel();
  JLabel greyCircle72 = new JLabel();
  JLabel greyCircle73 = new JLabel();
  JLabel greyCircle74 = new JLabel();
  JLabel greyCircle75 = new JLabel();
  JLabel greyCircle76 = new JLabel();
  JLabel greyCircle77 = new JLabel();
  JLabel greyCircle78 = new JLabel();
  JLabel greyCircle79 = new JLabel();
  JLabel greyCircle80 = new JLabel();
  JLabel greyCircle81 = new JLabel();
  JLabel greyCircle82 = new JLabel();
  JLabel greyCircle83 = new JLabel();
  JLabel greyCircle84 = new JLabel();
  JLabel greyCircle85 = new JLabel();
  JLabel greyCircle86 = new JLabel();
  JLabel greyCircle87 = new JLabel();
  JLabel greyCircle88 = new JLabel();
  JLabel greyCircle89 = new JLabel();
  JLabel greyCircle90 = new JLabel();
  JPanel greyCirclePanel;

  /*
  private int row = -2;
  private int column = -2; 
*/

  //CONSTRUCTOR
  public MyFrame (){
    this.setTitle("Janggi Game");
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    this.setResizable(false);
    this.setSize(800,620);

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0,0,540,600);
    
    //put grey circle stuff here
    greyCirclePanel = new JPanel();

    greyCirclePanel.setSize(540, 600);

    greyCirclePanel.setOpaque(false);

    greyCirclePanel.setLayout(new GridLayout(10,9,0,0));

    //add grey circles to 2d array (lmao)

    greyCircles[0][0] = greyCircle1;
    greyCircles[0][1] = greyCircle2;
    greyCircles[0][2] = greyCircle3;
    greyCircles[0][3] = greyCircle4;
    greyCircles[0][4] = greyCircle5;
    greyCircles[0][5] = greyCircle6;
    greyCircles[0][6] = greyCircle7;
    greyCircles[0][7] = greyCircle8;
    greyCircles[0][8] = greyCircle9;
    
    greyCircles[1][0] = greyCircle10;
    greyCircles[1][1] = greyCircle11;
    greyCircles[1][2] = greyCircle12;
    greyCircles[1][3] = greyCircle13;
    greyCircles[1][4] = greyCircle14;
    greyCircles[1][5] = greyCircle15;
    greyCircles[1][6] = greyCircle16;
    greyCircles[1][7] = greyCircle17;
    greyCircles[1][8] = greyCircle18;
    
    greyCircles[2][0] = greyCircle19;
    greyCircles[2][1] = greyCircle20;
    greyCircles[2][2] = greyCircle21;
    greyCircles[2][3] = greyCircle22;
    greyCircles[2][4] = greyCircle23;
    greyCircles[2][5] = greyCircle24;
    greyCircles[2][6] = greyCircle25;
    greyCircles[2][7] = greyCircle26;
    greyCircles[2][8] = greyCircle27;
    
    greyCircles[3][0] = greyCircle28;
    greyCircles[3][1] = greyCircle29;
    greyCircles[3][2] = greyCircle30;
    greyCircles[3][3] = greyCircle31;
    greyCircles[3][4] = greyCircle32;
    greyCircles[3][5] = greyCircle33;
    greyCircles[3][6] = greyCircle34;
    greyCircles[3][7] = greyCircle35;
    greyCircles[3][8] = greyCircle36;
    
    greyCircles[4][0] = greyCircle37;
    greyCircles[4][1] = greyCircle38;
    greyCircles[4][2] = greyCircle39;
    greyCircles[4][3] = greyCircle40;
    greyCircles[4][4] = greyCircle41;
    greyCircles[4][5] = greyCircle42;
    greyCircles[4][6] = greyCircle43;
    greyCircles[4][7] = greyCircle44;
    greyCircles[4][8] = greyCircle45;
    
    greyCircles[5][0] = greyCircle46;
    greyCircles[5][1] = greyCircle47;
    greyCircles[5][2] = greyCircle48;
    greyCircles[5][3] = greyCircle49;
    greyCircles[5][4] = greyCircle50;
    greyCircles[5][5] = greyCircle51;
    greyCircles[5][6] = greyCircle52;
    greyCircles[5][7] = greyCircle53;
    greyCircles[5][8] = greyCircle54;
    
    greyCircles[6][0] = greyCircle55;
    greyCircles[6][1] = greyCircle56;
    greyCircles[6][2] = greyCircle57;
    greyCircles[6][3] = greyCircle58;
    greyCircles[6][4] = greyCircle59;
    greyCircles[6][5] = greyCircle60;
    greyCircles[6][6] = greyCircle61;
    greyCircles[6][7] = greyCircle62;
    greyCircles[6][8] = greyCircle63;
    
    greyCircles[7][0] = greyCircle64;
    greyCircles[7][1] = greyCircle65;
    greyCircles[7][2] = greyCircle66;
    greyCircles[7][3] = greyCircle67;
    greyCircles[7][4] = greyCircle68;
    greyCircles[7][5] = greyCircle69;
    greyCircles[7][6] = greyCircle70;
    greyCircles[7][7] = greyCircle71;
    greyCircles[7][8] = greyCircle72;
    
    greyCircles[8][0] = greyCircle73;
    greyCircles[8][1] = greyCircle74;
    greyCircles[8][2] = greyCircle75;
    greyCircles[8][3] = greyCircle76;
    greyCircles[8][4] = greyCircle77;
    greyCircles[8][5] = greyCircle78;
    greyCircles[8][6] = greyCircle79;
    greyCircles[8][7] = greyCircle80;
    greyCircles[8][8] = greyCircle81;
    
    greyCircles[9][0] = greyCircle82;
    greyCircles[9][1] = greyCircle83;
    greyCircles[9][2] = greyCircle84;
    greyCircles[9][3] = greyCircle85;
    greyCircles[9][4] = greyCircle86;
    greyCircles[9][5] = greyCircle87;
    greyCircles[9][6] = greyCircle88;
    greyCircles[9][7] = greyCircle89;
    greyCircles[9][8] = greyCircle90;

    for(int r = 0; r < 10; r++)
    {
      for(int c = 0; c < 9; c++)
      {
        greyCircles[r][c].setIcon(new ImageIcon(new ImageIcon("grey_circle.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        greyCircles[r][c].setVisible(false);
        greyCirclePanel.add(greyCircles[r][c]);
      }
    }
    
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

    layeredPane.add(greyCirclePanel);
    layeredPane.add(piecePanel);
    layeredPane.add(label);

    this.add(layeredPane);
    
    


    ImageIcon image = new ImageIcon("red_king.png");
    this.setIconImage(image.getImage());
    piecePanel.setVisible(true);
    this.setVisible(true);
    printAllPieces();

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
          graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("empty_place.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        }
        else if (Board.getPiece(r, c).getTeam() == true)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("green_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
        else if (Board.getPiece(r, c).getTeam() == false)
        {
          if (Board.getPiece(r, c) instanceof King)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_king.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Guard)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_guard.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Knight)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_knight.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Elephant)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_elephant.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Rook)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_rook.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Pawn)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_pawn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
          else if (Board.getPiece(r, c) instanceof Cannon)
          {
            graphicalPieces[r][c].setIcon(new ImageIcon(new ImageIcon("red_cannon.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
          }
        
        }
      }
    }
  }

  public static void updateMovedPieces(int r1, int c1, int r2, int c2)
  {
    graphicalPieces[r2][c2].setIcon(graphicalPieces[r1][c1].getIcon());
    graphicalPieces[r1][c1].setIcon(new ImageIcon(new ImageIcon("empty_place.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
  }

  /*
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
  */

  private boolean turn = true;
  private int clickTimes = 0;
  //private boolean flipped = false;
  private int kingsFacingTurns = 0;
  private boolean facingDraw = false;
  private int r1, c1, r2, c2; 
  
  public void mouseClicked(MouseEvent e)
  {
    if (!(facingDraw || Board.getGreenKing().isCheckmate() || Board.getRedKing().isCheckmate()))
    {
      int row = 0;
      int column = 0;
      
    
      
      if(e.getSource() == place1)
      {
        row = 0;
        column = 0;
      }
      else if (e.getSource() == place2)
      {
        row = 0;
        column = 1;
      }
      else if (e.getSource() == place3)
      {
        row = 0;
        column = 2;
      }
      else if (e.getSource() == place4)
      {
        row = 0;
        column = 3;
      }
      else if (e.getSource() == place5)
      {
        row = 0;
        column = 4;
      }
      else if (e.getSource() == place6)
      {
        row = 0;
        column = 5;
      }
      else if (e.getSource() == place7)
      {
        row = 0;
        column = 6;
      }
      else if (e.getSource() == place8)
      {
        row = 0;
        column = 7;
      }
      else if (e.getSource() == place9)
      {
        row = 0;
        column = 8;
      }
      else if (e.getSource() == place10)
      {
        row = 1;
        column = 0;
      }
      else if (e.getSource() == place11)
      {
        row = 1;
        column = 1;
      }
      else if (e.getSource() == place12)
      {
        row = 1;
        column = 2;
      }
      else if (e.getSource() == place13)
      {
        row = 1;
        column = 3;
      }
      else if (e.getSource() == place14)
      {
        row = 1;
        column = 4;
      }
      else if (e.getSource() == place15)
      {
        row = 1;
        column = 5;
      }
      else if (e.getSource() == place16)
      {
        row = 1;
        column = 6;
      }
      else if (e.getSource() == place17)
      {
        row = 1;
        column = 7;
      }
      else if (e.getSource() == place18)
      {
        row = 1;
        column = 8;
      }
      else if (e.getSource() == place19)
      {
        row = 2;
        column = 0;
      }
      else if (e.getSource() == place20)
      {
        row = 2;
        column = 1;
      }
      else if (e.getSource() == place21)
      {
        row = 2;
        column = 2;
      }
      else if (e.getSource() == place22)
      {
        row = 2;
        column = 3;
      }
      else if (e.getSource() == place23)
      {
        row = 2;
        column = 4;
      }
      else if (e.getSource() == place24)
      {
        row = 2;
        column = 5;
      }
      else if (e.getSource() == place25)
      {
        row = 2;
        column = 6;
      }
      else if (e.getSource() == place26)
      {
        row = 2;
        column = 7;
      }
      else if (e.getSource() == place27)
      {
        row = 2;
        column = 8;
      }
      else if (e.getSource() == place28)
      {
        row = 3;
        column = 0;
      }
      else if (e.getSource() == place29)
      {
        row = 3;
        column = 1;
      }
      else if (e.getSource() == place30)
      {
        row = 3;
        column = 2;
      }
      else if (e.getSource() == place31)
      {
        row = 3;
        column = 3;
      }
      else if (e.getSource() == place32)
      {
        row = 3;
        column = 4;
      }
      else if (e.getSource() == place33)
      {
        row = 3;
        column = 5;
      }
      else if (e.getSource() == place34)
      {
        row = 3;
        column = 6;
      }
      else if (e.getSource() == place35)
      {
        row = 3;
        column = 7;
      }
      else if (e.getSource() == place36)
      {
        row = 3;
        column = 8;
      }
      else if (e.getSource() == place37)
      {
        row = 4;
        column = 0;
      }
      else if (e.getSource() == place38)
      {
        row = 4;
        column = 1;
      }
      else if (e.getSource() == place39)
      {
        row = 4;
        column = 2;
      }
      else if (e.getSource() == place40)
      {
        row = 4;
        column = 3;
      }
      else if (e.getSource() == place41)
      {
        row = 4;
        column = 4;
      }
      else if (e.getSource() == place42)
      {
        row = 4;
        column = 5;
      }
      else if (e.getSource() == place43)
      {
        row = 4;
        column = 6;
      }
      else if (e.getSource() == place44)
      {
        row = 4;
        column = 7;
      }
      else if (e.getSource() == place45)
      {
        row = 4;
        column = 8;
      }
      else if (e.getSource() == place46)
      {
        row = 5;
        column = 0;
      }
      else if (e.getSource() == place47)
      {
        row = 5;
        column = 1;
      }
      else if (e.getSource() == place48)
      {
        row = 5;
        column = 2;
      }
      else if (e.getSource() == place49)
      {
        row = 5;
        column = 3;
      }
      else if (e.getSource() == place50)
      {
        row = 5;
        column = 4;
      }
      else if (e.getSource() == place51)
      {
        row = 5;
        column = 5;
      }
      else if (e.getSource() == place52)
      {
        row = 5;
        column = 6;
      }
      else if (e.getSource() == place53)
      {
        row = 5;
        column = 7;
      }
      else if (e.getSource() == place54)
      {
        row = 5;
        column = 8;
      }
      else if (e.getSource() == place55)
      {
        row = 6;
        column = 0;
      }
      else if (e.getSource() == place56)
      {
        row = 6;
        column = 1;
      }
      else if (e.getSource() == place57)
      {
        row = 6;
        column = 2;
      }
      else if (e.getSource() == place58)
      {
        row = 6;
        column = 3;
      }
      else if (e.getSource() == place59)
      {
        row = 6;
        column = 4;
      }
      else if (e.getSource() == place60)
      {
        row = 6;
        column = 5;
      }
      else if (e.getSource() == place61)
      {
        row = 6;
        column = 6;
      }
      else if (e.getSource() == place62)
      {
        row = 6;
        column = 7;
      }
      else if (e.getSource() == place63)
      {
        row = 6;
        column = 8;
      }
      else if (e.getSource() == place64)
      {
        row = 7;
        column = 0;
      }
      else if (e.getSource() == place65)
      {
        row = 7;
        column = 1;
      }
      else if (e.getSource() == place66)
      {
        row = 7;
        column = 2;
      }
      else if (e.getSource() == place67)
      {
        row = 7;
        column = 3;
      }
      else if (e.getSource() == place68)
      {
        row = 7;
        column = 4;
      }
      else if (e.getSource() == place69)
      {
        row = 7;
        column = 5;
      }
      else if (e.getSource() == place70)
      {
        row = 7;
        column = 6;
      }
      else if (e.getSource() == place71)
      {
        row = 7;
        column = 7;
      }
      else if (e.getSource() == place72)
      {
        row = 7;
        column = 8;
      }
      else if (e.getSource() == place73)
      {
        row = 8;
        column = 0;
      }
      else if (e.getSource() == place74)
      {
        row = 8;
        column = 1;
      }
      else if (e.getSource() == place75)
      {
        row = 8;
        column = 2;
      }
      else if (e.getSource() == place76)
      {
        row = 8;
        column = 3;
      }
      else if (e.getSource() == place77)
      {
        row = 8;
        column = 4;
      }
      else if (e.getSource() == place78)
      {
        row = 8;
        column = 5;
      }
      else if (e.getSource() == place79)
      {
        row = 8;
        column = 6;
      }
      else if (e.getSource() == place80)
      {
        row = 8;
        column = 7;
      }
      else if (e.getSource() == place81)
      {
        row = 8;
        column = 8;
      }
      else if (e.getSource() == place82)
      {
        row = 9;
        column = 0;
      }
      else if (e.getSource() == place83)
      {
        row = 9;
        column = 1;
      }
      else if (e.getSource() == place84)
      {
        row = 9;
        column = 2;
      }
      else if (e.getSource() == place85)
      {
        row = 9;
        column = 3;
      }
      else if (e.getSource() == place86)
      {
        row = 9;
        column = 4;
      }
      else if (e.getSource() == place87)
      {
        row = 9;
        column = 5;
      }
      else if (e.getSource() == place88)
      {
        row = 9;
        column = 6;
      }
      else if (e.getSource() == place89)
      {
        row = 9;
        column = 7;
      }
      else if (e.getSource() == place90)
      {
        row = 9;
        column = 8;
      }
      if(clickTimes == 0)
      {
        r1 = row;
        c1 = column;
        if (Board.getPiece(r1, c1) != null && Board.getPiece(r1, c1).getTeam() == turn)
        {
          boolean validMoves = false;
          for (int r = 0; r < 10; r++)
          {
            for (int c = 0; c < 9; c++)
            {
              if (Board.getPiece(r1, c1).canMove(r, c) && !checkForSuicideMove(r1, c1, r, c))
              {
                validMoves = true;
                greyCircles[r][c].setVisible(true);
              }
            }
          }
          if (validMoves)
          {
            clickTimes++;
          }
        }
      }
      else if(clickTimes == 1)
      {
        r2 = row;
        c2 = column;
        if(kingsFacingDraw(r1, c1, r2, c2))
        {
          updateMovedPieces(r1, c1, r2, c2);
        }
        if(!(Board.getPiece(r1, c1) == null || Board.getPiece(r1, c1).getTeam() != turn || !Board.getPiece(r1, c1).canMove(r2, c2) || checkForSuicideMove(r1, c1, r2, c2)))
        {
          updateMovedPieces(r1, c1, r2, c2);
          Board.movePiece(r1, c1, r2, c2);
          turn = !turn;
        }

        for (int r = 0; r < 10; r++)
        {
          for (int c = 0; c < 9; c++)
          {
            greyCircles[r][c].setVisible(false);
          }
        }
        
        clickTimes = 0;
        if (facingDraw)
        {
          System.out.println("draw");
        }
        else if (Board.getGreenKing().isCheckmate())
        {
          System.out.println("red wins");
        }
        else if (Board.getRedKing().isCheckmate())
        {
          System.out.println("green wins");
        }
      }
    }
  }

  public boolean checkForSuicideMove(int r1, int c1, int r2, int c2)
  {
    //System.out.println("running checkForSuicideMove");
    boolean suicideMove = false;
    if(Board.getPiece(r1, c1) != null && Board.getPiece(r1, c1).canMove(r2, c2))
    {
      Piece temp = Board.getPiece(r2, c2);
      Board.movePiece(r1, c1, r2, c2);
      if(turn && Board.getGreenKing().isInCheck(Board.getRed()))
      {
        suicideMove = true;
      }
      else if(!turn && Board.getRedKing().isInCheck(Board.getGreen()))
      {
        suicideMove = true;
      }
      Board.movePiece(r2, c2, r1, c1);
      Board.setPiece(r2, c2, temp);
    }
    System.out.println(suicideMove);
    return suicideMove;
  }

  public boolean kingsFacingDraw(int r1, int c1, int r2, int c2)
  {
    //System.out.println("kingsFacingDraw");
    boolean result = false;
    if (Board.getPiece(r1, c1) != null && Board.getPiece(r1, c1).canMove(r2, c2))
    {
      Piece temp = Board.getPiece(r2, c2);
      Board.movePiece(r1, c1, r2, c2);
      if(kingsFacingTurns == 0)
      {
        if(!checkForSuicideMove(r1, c1, r2, c2) && Board.kingsAreFacing())
        {
          kingsFacingTurns++;
        }
      }
      else if(kingsFacingTurns == 1)
      {
        if(!checkForSuicideMove(r1, c1, r2, c2) && !Board.kingsAreFacing())
        {
          kingsFacingTurns = 0;
        }
        else if(Board.kingsAreFacing())
        {
          result = true;
          facingDraw = true;
        }
      }
      if(!result)
      {
        Board.movePiece(r2, c2, r1, c1);
        Board.setPiece(r2, c2, temp);
      }
    }
    return result;
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
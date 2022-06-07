import javax.swing.JFrame;
import java.util.*;
public class Main {
  /*
  static boolean turn = true;
  static boolean suicideMove = false;
  static boolean flipped = false;
  static int kingsFacingTurns = 0;
  static boolean facingDraw = false;
  static int r1, c1, r2, c2;
  static boolean firstTurn; //testing
  */


  /* WELCOME TO THE FILES! YOU HAVE UNLOCKED SECRET: FLIP BOARD

  Enter:
  6
  12
  9
  16
  
  You will flip the board and therefore resign.

  Enjoy reading the rest of the dumpster that is the code.
  */

  /*public static MyFrame getFrame()
  {
    return frame;
  }*/
  
  public static void main(String[] args) {
    Board b = new Board();
    MyFrame frame = new MyFrame();
    /*
    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to Korean chess!");
    for (int i = 0; i < Board.getGreen().size(); i++)
    {
      if (Board.getGreen().get(i) instanceof Pawn)
      {
        System.out.print("P");
      }
      else if (Board.getGreen().get(i) instanceof Guard)
      {
        System.out.print("G");
      }
      else if (Board.getGreen().get(i) instanceof Knight)
      {
        System.out.print("N");
      }
      else if (Board.getGreen().get(i) instanceof Elephant)
      {
        System.out.print("E");
      }
      else if (Board.getGreen().get(i) instanceof Rook)
      {
        System.out.print("R");
      }
      else if (Board.getGreen().get(i) instanceof Cannon)
      {
        System.out.print("C");
      }
      else if (Board.getGreen().get(i) instanceof King)
      {
        System.out.print("K");
      }
    }
    System.out.println();
    for (int i = 0; i < Board.getRed().size(); i++)
    {
      if (Board.getRed().get(i) instanceof Pawn)
      {
        System.out.print("P");
      }
      else if (Board.getRed().get(i) instanceof Guard)
      {
        System.out.print("G");
      }
      else if (Board.getRed().get(i) instanceof Knight)
      {
        System.out.print("N");
      }
      else if (Board.getRed().get(i) instanceof Elephant)
      {
        System.out.print("E");
      }
      else if (Board.getRed().get(i) instanceof Rook)
      {
        System.out.print("R");
      }
      else if (Board.getRed().get(i) instanceof Cannon)
      {
        System.out.print("C");
      }
      else if (Board.getRed().get(i) instanceof King)
      {
        System.out.print("K");
      }
    }
    System.out.println();

    frame.printAllPieces();


    
    game:
      while (!Board.getGreenKing().isCheckmate() && !Board.getRedKing().isCheckmate())
      {
        Board.printBoard();
        //Board.printBoardGraphically();
        
        //GREEN'S TURN
        if (turn)
        {
          frame.cleanCoordinates();

          r1 = frame.getRow();
          c1 = frame.getColumn();
          System.out.println(ConsoleColors.GREEN + "--Green--" + ConsoleColors.RESET);
          System.out.println("Enter row of start: ");
          if (r1 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
            continue;
          }
          System.out.println("Enter column of start: ");
          if (c1 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
            continue;
          }

          frame.cleanCoordinates();

          r2 = frame.getRow();
          c2 = frame.getColumn();
          System.out.println("Enter row of end: ");
          if (r2 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
            continue;
          }
          System.out.println("Enter column of end: ");
          if (c2 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
            continue;
          }

          if(r1 == 6 && c1 == 12 && r2 == 9 && c2 == 16)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }

          checkForSuicideMove(r1, c1, r2, c2);
          
          if(kingsFacingDraw(r1, c1, r2, c2))
          {
            MyFrame.updateMovedPieces(r1, c1, r2, c2);
            break game;
          }
          while (Board.getPiece(r1, c1) == null || Board.getPiece(r1, c1).getTeam() == false || !Board.getPiece(r1, c1).canMove(r2, c2) || suicideMove)
          {
            System.out.println("You're stupid.");
            frame.cleanCoordinates();

          r1 = frame.getRow();
          c1 = frame.getColumn();
            System.out.println(ConsoleColors.GREEN + "--Green--" + ConsoleColors.RESET);
            System.out.println("Enter row of start: ");
            if (r1 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
              continue;
            }
            System.out.println("Enter column of start: ");
            if (c1 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
              continue;
            }

            frame.cleanCoordinates();

            r2 = frame.getRow();
            c2 = frame.getColumn();
                       System.out.println("Enter row of end: ");
            if (r2 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
              continue;
            }
            System.out.println("Enter column of end: ");
            if (c2 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.GREEN + "Green passed." + ConsoleColors.RESET);
              continue;
            }

            if(r1 == 6 && c1 == 12 && r2 == 9 && c2 == 16)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
  
            checkForSuicideMove(r1, c1, r2, c2);
            
            if(kingsFacingDraw(r1, c1, r2, c2))
            {
              MyFrame.updateMovedPieces(r1, c1, r2, c2);
              break game;
            }
          }

          MyFrame.updateMovedPieces(r1, c1, r2, c2);
          Board.movePiece(r1, c1, r2, c2);
  
          System.out.println("You're smart");
          
        }
        //RED'S TURN
        else
        {
          frame.cleanCoordinates();


          r1 = frame.getRow();
          c1 = frame.getColumn();
          System.out.println(ConsoleColors.RED + "--Red--" + ConsoleColors.RESET);
          System.out.println("Enter row of start: ");
          //if(MyFrame.getEntered())
          if (r1 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
            continue;
          }
          System.out.println("Enter column of start: ");
          if (c1 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
            continue;
          }
          frame.cleanCoordinates(); 

          r2 = frame.getRow();
          c2 = frame.getColumn();
          System.out.println("Enter row of end: ");
          if (r2 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
            continue;
          }
          System.out.println("Enter column of end: ");
          if (c2 == -1)
          {
            turn = !turn;
            System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
            continue;
          }

          if(r1 == 6 && c1 == 12 && r2 == 9 && c2 == 16)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          
          checkForSuicideMove(r1, c1, r2, c2);

          if(kingsFacingDraw(r1, c1, r2, c2))
          {
            MyFrame.updateMovedPieces(r1, c1, r2, c2);
            break game;
          }
          while (Board.getPiece(r1, c1) == null || Board.getPiece(r1, c1).getTeam() == true || !Board.getPiece(r1, c1).canMove(r2, c2) || suicideMove)
          {
            System.out.println("You're stupid.");
            frame.cleanCoordinates();

            r1 = frame.getRow();
            c1 = frame.getColumn();
            System.out.println(ConsoleColors.RED + "--RED--" + ConsoleColors.RESET);
            System.out.println("Enter row of start: ");
            if (r1 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
              continue;
            }
            System.out.println("Enter column of start: ");
            if (c1 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
              continue;
            }
            frame.cleanCoordinates();

            r2 = frame.getRow();
            c2 = frame.getColumn();
            System.out.println("Enter row of end: ");
            if (r2 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
              continue;
            }
            System.out.println("Enter column of end: ");
            if (c2 == -1)
            {
              turn = !turn;
              System.out.println(ConsoleColors.RED + "Red passed." + ConsoleColors.RESET);
              continue;
            }

            if(r1 == 6 && c1 == 12 && r2 == 9 && c2 == 16)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
  
            checkForSuicideMove(r1, c1, r2, c2);

            if(kingsFacingDraw(r1, c1, r2, c2))
            {
              frame.updateMovedPieces(r1, c1, r2, c2);
              break game;
            }
          }

          frame.updateMovedPieces(r1, c1, r2, c2);
          Board.movePiece(r1, c1, r2, c2);
          
  
          System.out.println("You're smart");
          
        }
        turn = !turn;
        for (int i = 0; i < Board.getGreen().size(); i++)
        {
          if (Board.getGreen().get(i) instanceof Pawn)
          {
            System.out.print("P");
          }
          else if (Board.getGreen().get(i) instanceof Guard)
          {
            System.out.print("G");
          }
          else if (Board.getGreen().get(i) instanceof Knight)
          {
            System.out.print("N");
          }
          else if (Board.getGreen().get(i) instanceof Elephant)
          {
            System.out.print("E");
          }
          else if (Board.getGreen().get(i) instanceof Rook)
          {
            System.out.print("R");
          }
          else if (Board.getGreen().get(i) instanceof Cannon)
          {
            System.out.print("C");
          }
          else if (Board.getGreen().get(i) instanceof King)
          {
            System.out.print("K");
          }
        }
        System.out.println();
        for (int i = 0; i < Board.getRed().size(); i++)
        {
          if (Board.getRed().get(i) instanceof Pawn)
          {
            System.out.print("P");
          }
          else if (Board.getRed().get(i) instanceof Guard)
          {
            System.out.print("G");
          }
          else if (Board.getRed().get(i) instanceof Knight)
          {
            System.out.print("N");
          }
          else if (Board.getRed().get(i) instanceof Elephant)
          {
            System.out.print("E");
          }
          else if (Board.getRed().get(i) instanceof Rook)
          {
            System.out.print("R");
          }
          else if (Board.getRed().get(i) instanceof Cannon)
          {
            System.out.print("C");
          }
          else if (Board.getRed().get(i) instanceof King)
          {
            System.out.print("K");
          }
        }
        System.out.println();
        
      }


    
    //end of game
    Board.printBoard();
    if (flipped)
    {
      frame.printAllPieces();
      if (turn)
      {
        System.out.println("Green flipped the board. What a baby. Loser. Little wah wah infant poopy diapers.");
      }
      else
      {
        System.out.println("Red flipped the board. What a baby. Loser. Little wah wah infant poopy diapers.");
      }
    }
    else if (Board.getGreenKing().isCheckmate())
    {

      System.out.println("Checkmate. Red wins. Green sucks.");
    }
    else if (Board.getRedKing().isCheckmate())
    {

      System.out.println("Checkmate. Green wins. Red sucks.");
    }
    else if (facingDraw)
    {
      System.out.println("The game ended in a draw as the players agreed to let the kings face each other."); 
    }
  */
  }

  /*
  public static boolean kingsFacingDraw(int r1, int c1, int r2, int c2)
  {
    //System.out.println("kingsFacingDraw");
    boolean result = false;
    if (Board.getPiece(r1, c1) != null && Board.getPiece(r1, c1).canMove(r2, c2))
    {
      Piece temp = Board.getPiece(r2, c2);
      Board.movePiece(r1, c1, r2, c2);
      if(kingsFacingTurns == 0)
      {
        if(!suicideMove && Board.kingsAreFacing())
        {
          kingsFacingTurns++;
        }
      }
      else if(kingsFacingTurns == 1)
      {
        if(!suicideMove && !Board.kingsAreFacing())
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

  public static void checkForSuicideMove(int r1, int c1, int r2, int c2)
  {
    //System.out.println("running checkForSuicideMove");
    suicideMove = false;
    if(Board.getPiece(r1, c1) != null && Board.getPiece(r1, c1).canMove(r2, c2))
    {
      temp = Board.getPiece(r2, c2);
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
  }
  */

}

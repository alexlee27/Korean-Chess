import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Board b = new Board();
    boolean turn = true;
    boolean suicideMove = false;
    boolean flipped = false;
    System.out.println("Welcome to Korean chess!");

    game:
      while (!Board.getGreenKing().isCheckmate() && !Board.getGreenKing().isCheckmate())
      {
        Board.printBoard();
        
        //GREEN'S TURN
        if (turn)
        {
          System.out.println(ConsoleColors.GREEN + "--Green--" + ConsoleColors.RESET);
          System.out.println("Enter row of start: ");
          int r1 = in.nextInt();
          if (r1 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter column of start: ");
          int c1 = in.nextInt();
          if (c1 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter row of end: ");
          int r2 = in.nextInt();
          if (r2 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter column of end: ");
          int c2 = in.nextInt();
          if (c2 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
  
  
          Piece temp = Board.getPiece(r2, c2);
          Board.movePiece(r1, c1, r2, c2);
          if(Board.getGreenKing().isInCheck(Board.getRed()))
          {
            suicideMove = true;
          }
          Board.movePiece(r2, c2, r1, c1);
          Board.setPiece(r2, c2, temp);
          while (Board.getPiece(r1, c1) == null || Board.getPiece(r1, c1).getTeam() == false || !Board.getPiece(r1, c1).canMove(r2, c2) || suicideMove)
          {
            System.out.println("You're stupid.");
            System.out.println(ConsoleColors.GREEN + "--Green--" + ConsoleColors.RESET);
            System.out.println("Enter row of start: ");
            r1 = in.nextInt();
            if (r1 == 10){
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter column of start: ");
            c1 = in.nextInt();
            if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter row of end: ");
            r2 = in.nextInt();
            if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter column of end: ");
            c2 = in.nextInt();
              if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
  
            suicideMove = false;
            temp = Board.getPiece(r2, c2);
            Board.movePiece(r1, c1, r2, c2);
            if(Board.getGreenKing().isInCheck(Board.getRed()))
            {
              suicideMove = true;
            }
            Board.movePiece(r2, c2, r1, c1);
            Board.setPiece(r2, c2, temp);
          }
  
          Board.movePiece(r1, c1, r2, c2);
  
          System.out.println("You're smart");
          
        }
        //RED'S TURN
        else
        {
          System.out.println(ConsoleColors.RED + "--Red--" + ConsoleColors.RESET);
          System.out.println("Enter row of start: ");
          int r1 = in.nextInt();
          if (r1 == 10){
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter column of start: ");
          int c1 = in.nextInt();
          if (c1 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter row of end: ");
          int r2 = in.nextInt();
          if (c1 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
          System.out.println("Enter column of end: ");
          int c2 = in.nextInt();
            if (c1 == 10)
          {
            Board.flipBoard();
            flipped = true;
            break game;
          }
  
          Piece temp = Board.getPiece(r2, c2);
          Board.movePiece(r1, c1, r2, c2);
          if(Board.getRedKing().isInCheck(Board.getGreen()))
          {
            suicideMove = true;
          }
          Board.movePiece(r2, c2, r1, c1);
          Board.setPiece(r2, c2, temp);
          while (Board.getPiece(r1, c1) == null || Board.getPiece(r1, c1).getTeam() == true || !Board.getPiece(r1, c1).canMove(r2, c2) || suicideMove)
          {
            System.out.println("You're stupid.");
            System.out.println(ConsoleColors.RED + "--RED--" + ConsoleColors.RESET);
            System.out.println("Enter row of start: ");
            r1 = in.nextInt();
            if (r1 == 10){
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter column of start: ");
            c1 = in.nextInt();
            if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter row of end: ");
            r2 = in.nextInt();
            if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
            System.out.println("Enter column of end: ");
            c2 = in.nextInt();
            if (c1 == 10)
            {
              Board.flipBoard();
              flipped = true;
              break game;
            }
  
            suicideMove = false;
            temp = Board.getPiece(r2, c2);
            Board.movePiece(r1, c1, r2, c2);
            if(Board.getRedKing().isInCheck(Board.getGreen()))
            {
              suicideMove = true;
            }
            Board.movePiece(r2, c2, r1, c1);
            Board.setPiece(r2, c2, temp);
          }
  
          Board.movePiece(r1, c1, r2, c2);
  
          System.out.println("You're smart");
          
        }
        turn = !turn;
      }


    Board.printBoard();
    //end of game
    if (flipped)
    {
      if (turn)
      {
        System.out.println("Green flipped the board. What a baby. Loser. Little wah wah infant poopy diapers.");
      }
      else
      {
        System.out.println("Red flipped the board. What a baby. Loser. Little wah wah infant poopy diapers.");
      }
    }
    else
    {
      if (Board.getGreenKing().isCheckmate())
      {
        System.out.println("Red wins. Green sucks.");
      }
      else if(Board.getRedKing().isCheckmate())
      {
        System.out.println("Green wins. Red sucks.");
      }
    }
    
    //System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));
   
   //System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));       //System.out.println(Board.getGreenKing().isCheckmate());
  }

}
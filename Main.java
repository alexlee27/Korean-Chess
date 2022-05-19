import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Board b = new Board();
    boolean turn = true;
    boolean suicideMove = false;
    
    System.out.println("Welcome to Korean chess!");
    
    while (!Board.getGreenKing().isCheckmate() && !Board.getGreenKing().isCheckmate())
    {
      Board.printBoard();
      
      //GREEN'S TURN
      if (turn)
      {
        System.out.println(ConsoleColors.GREEN + "--Green--" + ConsoleColors.RESET);
        System.out.println("Enter row of start: ");
        int r1 = in.nextInt();
        System.out.println("Enter column of start: ");
        int c1 = in.nextInt();
        System.out.println("Enter row of end: ");
        int r2 = in.nextInt();
        System.out.println("Enter column of end: ");
        int c2 = in.nextInt();

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
          System.out.println("Enter column of start: ");
          c1 = in.nextInt();
          System.out.println("Enter row of end: ");
          r2 = in.nextInt();
          System.out.println("Enter column of end: ");
          c2 = in.nextInt();

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

      
    }
    

    
    
    //System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));
   
   //System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));       //System.out.println(Board.getGreenKing().isCheckmate());
  }

}
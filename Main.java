import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Board b = new Board();
    
    //i made this change
    Board.printBoard();

    Board.movePiece(0, 7, 6, 5);
    Board.printBoard();
    System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));
  }

}
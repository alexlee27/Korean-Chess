import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Board b = new Board();
    //Piece rook2 = new Rook(true, 5, 0);
    /*
    Piece cannon1 = new Cannon(true, 9, 3);
    Piece rook1 = new Rook(false, 8, 4);
    Piece cannon3 = new Cannon(false, 7, 5);
    Piece pawn1 = new Pawn(true, 2, 1);

    Piece knight1 = new Knight(false, 4, 4);
    Piece elephant1 = new Elephant(true, 3, 2);
    Piece guard1 = new Guard(true, 8, 4);

    //hello world piece of shit

    //Board.setPiece(rook2.getRow(), rook2.getColumn(), rook2);
    //Board.setPiece(cannon1.getRow(), cannon1.getColumn(), cannon1);
    //Board.setPiece(rook1.getRow(), rook1.getColumn(), rook1 );
    //Board.setPiece(cannon3.getRow(), cannon3.getColumn(), cannon3);
    Board.setPiece(pawn1.getRow(), pawn1.getColumn(), pawn1);
    Board.setPiece(knight1.getRow(), knight1.getColumn(), knight1);
    Board.setPiece(elephant1.getRow(), elephant1.getColumn(), elephant1);
    //Board.setPiece(guard1.getRow(), guard1.getColumn(), guard1);
    Board.printBoard();*/ //hello btw 

  //hello world (personal profile)
    Board.printBoard();

    Board.movePiece(0, 7, 7, 6);
    Board.printBoard();
    System.out.println(Board.getGreenKing().isInCheck(Board.getRed()));
  }

}
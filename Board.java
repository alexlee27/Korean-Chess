import java.util.ArrayList;
public class Board
{
  private static ArrayList<Piece> green = new ArrayList<Piece>();
  private static ArrayList<Piece> red = new ArrayList<Piece>();
  private static Piece[][] board;
  public Board()
  {
    board = new Piece[10][9];
    Piece greenKing = new King(true, 8, 4);
    setPiece(greenKing.getRow(), greenKing.getColumn(), greenKing);
    Piece greenGuard1 = new Guard(true, 9, 3);
    setPiece(greenGuard1.getRow(), greenGuard1.getColumn(), greenGuard1);
    Piece greenGuard2 = new Guard(true, 9, 5);
    setPiece(greenGuard2.getRow(), greenGuard2.getColumn(), greenGuard2);
    Piece greenElephant1 = new Elephant(true, 9, 2);
    setPiece(greenElephant1.getRow(), greenElephant1.getColumn(), greenElephant1);
    Piece greenElephant2 = new Elephant(true, 9, 6);
    setPiece(greenElephant2.getRow(), greenElephant2.getColumn(), greenElephant2);
    Piece greenKnight1 = new Knight(true, 9, 1);
    setPiece(greenKnight1.getRow(), greenKnight1.getColumn(), greenKnight1);
    Piece greenKnight2 = new Knight(true, 9, 7);
    setPiece(greenKnight2.getRow(), greenKnight2.getColumn(), greenKnight2);
    Piece greenRook1 = new Rook(true, 9, 0);
    setPiece(greenRook1.getRow(), greenRook1.getColumn(), greenRook1);
    Piece greenRook2 = new Rook(true, 9, 8);
    setPiece(greenRook2.getRow(), greenRook2.getColumn(), greenRook2);
    Piece greenCannon1 = new Cannon(true, 7, 1);
    setPiece(greenCannon1.getRow(), greenCannon1.getColumn(), greenCannon1);
    Piece greenCannon2 = new Cannon(true, 7, 7);
    setPiece(greenCannon2.getRow(), greenCannon2.getColumn(), greenCannon2);
    Piece greenPawn1 = new Pawn(true, 6, 0);
    setPiece(greenPawn1.getRow(), greenPawn1.getColumn(), greenPawn1);
    Piece greenPawn2 = new Pawn(true, 6, 2);
    setPiece(greenPawn2.getRow(), greenPawn2.getColumn(), greenPawn2);
    Piece greenPawn3 = new Pawn(true, 6, 4);
    setPiece(greenPawn3.getRow(), greenPawn3.getColumn(), greenPawn3);
    Piece greenPawn4 = new Pawn(true, 6, 6);
    setPiece(greenPawn4.getRow(), greenPawn4.getColumn(), greenPawn4);
    Piece greenPawn5 = new Pawn(true, 6, 8);
    setPiece(greenPawn5.getRow(), greenPawn5.getColumn(), greenPawn5);
    Piece redKing = new King(false, 1, 4);
    setPiece(redKing.getRow(), redKing.getColumn(), redKing);
    Piece redGuard1 = new Guard(false, 0, 3);
    setPiece(redGuard1.getRow(), redGuard1.getColumn(), redGuard1);
    Piece redGuard2 = new Guard(false, 0, 5);
    setPiece(redGuard2.getRow(), redGuard2.getColumn(), redGuard2);
    Piece redElephant1 = new Elephant(false, 0, 2);
    setPiece(redElephant1.getRow(), redElephant1.getColumn(), redElephant1);
    Piece redElephant2 = new Elephant(false, 0, 6);
    setPiece(redElephant2.getRow(), redElephant2.getColumn(), redElephant2);
    Piece redKnight1 = new Knight(false, 0, 1);
    setPiece(redKnight1.getRow(), redKnight1.getColumn(), redKnight1);
    Piece redKnight2 = new Knight(false, 0, 7);
    setPiece(redKnight2.getRow(), redKnight2.getColumn(), redKnight2);
    Piece redRook1 = new Rook(false, 0, 0);
    setPiece(redRook1.getRow(), redRook1.getColumn(), redRook1);
    Piece redRook2 = new Rook(false, 0, 8);
    setPiece(redRook2.getRow(), redRook2.getColumn(), redRook2);
    Piece redCannon1 = new Cannon(false, 2, 1);
    setPiece(redCannon1.getRow(), redCannon1.getColumn(), redCannon1);
    Piece redCannon2 = new Cannon(false, 2, 7);
    setPiece(redCannon2.getRow(), redCannon2.getColumn(), redCannon2);
    Piece redPawn1 = new Pawn(false, 3, 0);
    setPiece(redPawn1.getRow(), redPawn1.getColumn(), redPawn1);
    Piece redPawn2 = new Pawn(false, 3, 2);
    setPiece(redPawn2.getRow(), redPawn2.getColumn(), redPawn2);
    Piece redPawn3 = new Pawn(false, 3, 4);
    setPiece(redPawn3.getRow(), redPawn3.getColumn(), redPawn3);
    Piece redPawn4 = new Pawn(false, 3, 6);
    setPiece(redPawn4.getRow(), redPawn4.getColumn(), redPawn4);
    Piece redPawn5 = new Pawn(false, 3, 8);
    setPiece(redPawn5.getRow(), redPawn5.getColumn(), redPawn5);

    green.add(greenKing);
    green.add(greenGuard1);
    green.add(greenGuard2);
    green.add(greenElephant1);
    green.add(greenElephant2);
    green.add(greenKnight1);
    green.add(greenKnight2);
    green.add(greenRook1);
    green.add(greenRook2);
    green.add(greenCannon1);
    green.add(greenCannon2);
    green.add(greenPawn1);
    green.add(greenPawn2);
    green.add(greenPawn3);
    green.add(greenPawn4);
    green.add(greenPawn5);
    red.add(redKing);
    red.add(redGuard1);
    red.add(redGuard2);
    red.add(redElephant1);
    red.add(redElephant2);
    red.add(redKnight1);
    red.add(redKnight2);
    red.add(redRook1);
    red.add(redRook2);
    red.add(redCannon1);
    red.add(redCannon2);
    red.add(redPawn1);
    red.add(redPawn2);
    red.add(redPawn3);
    red.add(redPawn4);
    red.add(redPawn5);
  }
  public static void setPiece(int r, int c, Piece p)
  {
    board[r][c] = p;
  }
  public static void movePiece(int row1, int col1, int row2, int col2)
  {
    if(row1 != row2 || col1 != col2)
    {
      board[row1][col1].setCoord(row2, col2);
      board[row2][col2] = board[row1][col1];
      board[row1][col1] = null;
    }
  }
  public static Piece getPiece(int r, int c)
  {
    return board[r][c];
  }

  public static void printBoard()
  {
    System.out.println("    0    1    2    3    4    5    6    7    8 ");
    for(int r = 0; r < board.length; r++)
    {
      System.out.print(r + " ");
      for(int c = 0; c < board[0].length; c++)
      {
        System.out.print("──");
        if (getPiece(r, c) != null && getPiece(r, c).getTeam() == true)
        {
          System.out.print(ConsoleColors.GREEN);
        }
        else if (getPiece(r, c) != null && getPiece(r, c).getTeam() == false)
        {
          System.out.print(ConsoleColors.RED);
        }
        if (getPiece(r, c) == null)
        {
          System.out.print("┼");
        }
        else if(getPiece(r, c) instanceof Rook)
        {
          System.out.print("R");
        }
        else if(getPiece(r, c) instanceof Cannon)
        {
          System.out.print("C");
        }
        else if(getPiece(r, c) instanceof Pawn)
        {
          System.out.print("P");
        }
        else if(getPiece(r, c) instanceof Knight)
        {
          System.out.print("N");
        }
        else if(getPiece(r, c) instanceof Elephant)
        {
          System.out.print("E");
        }
        else if(getPiece(r, c) instanceof Guard)
        {
          System.out.print("G");
        }
        else if(getPiece(r, c) instanceof King)
        {
          System.out.print("K");
        }
        System.out.print(ConsoleColors.RESET);
        System.out.print("──");
      }
      //System.out.println("  |    |    |    |    |    |    |    |    |  ");
      System.out.println();
      System.out.println("    │    │    │    │    │    │    │    │    │  ");
    }
  }
  public static ArrayList<Piece> getGreen()
  {
    return green;
  }
  public static ArrayList<Piece> getRed()
  {
    return red;
  }

  public static Piece getGreenKing()
  {
    return green.get(0);
  }

  public static Piece getRedKing()
  {
    return red.get(0);
  }
}
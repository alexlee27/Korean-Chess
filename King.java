import java.lang.Math;
import java.util.ArrayList;
public class King extends Piece
{
  public King(boolean t, int r, int c)
  {
    super(t, r, c);
  }
  public boolean canMove(int r, int c)
  {
    if (destIsValid(r, c))
    {
      if (Math.abs(r - super.getRow()) <= 1 && Math.abs(c - super.getColumn()) <= 1)
      {
        if(super.getTeam() == true)
        {  
          //if middle then move anywhere else
          if (super.getRow() == 8 && super.getColumn() == 4)
          {
            return true;
          }
          else
          {
            if (r == 8 && c == 4)
            {
              return true;
            }
            if (Math.abs(r - super.getRow()) == 1 && c == super.getColumn())
            {
              return true;
            }
            if (Math.abs(c - super.getColumn()) == 1 && r == super.getRow())
            {
              return true;
            }
          }
        }
        else
        {
          if (super.getRow() == 1 && super.getColumn() == 4)
          {
            return true;
          }
          else 
          {
            if (r == 1 && c == 4)
            {
              return true;
            }
            if (Math.abs(r - super.getRow()) == 1 && c == super.getColumn())
            {
              return true;
            }
            if (Math.abs(c - super.getColumn()) == 1 && r == super.getRow())
            {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  public boolean destIsValid(int r, int c)
  {
    if (Board.getPiece(r, c) != null && Board.getPiece(r, c).getTeam() == super.getTeam())
    {
      return false;
    }
    if (super.getTeam() == true)
    {
      if (c >= 3 && c <= 5)
      {
        if (r >= 7)
        {
          return true;
        }
      }
    }
    else
    {
      if (c >= 3 && c <= 5)
      {
        if (r <= 2)
        {
          return true;
        }
      }
    }
    return false;
  }

  public boolean isInCheck(ArrayList<Piece> enemies)
  {
    for(Piece p : enemies)
    {
      if(p.canMove(super.getRow(), super.getColumn()))
      {
        return true;
      }
    }
    return false;
  }

  //Precondition: one king is already in check
  public boolean isCheckmate()
  {
    //if method was called with green king
    if(super.getTeam() == true)
    {
      //scanning through entire board
      for(int r = 0; r <= 9; r++)
      {
        for(int c = 0; c <= 8; c++)
        {
          //no need to check if square is occupied by a teammate piece
          if (Board.getPiece(r, c) == null || Board.getPiece(r, c).getTeam() == false)
          {
            for(Piece p : Board.getGreen())
            {
              if(p.canMove(r, c))
              {
                int originalRow = p.getRow();
                int originalColumn = p.getColumn();
                Piece temp = Board.getPiece(r, c);
                Board.movePiece(p.getRow(), p.getColumn(), r, c);
                if(!isInCheck(Board.getRed()))
                {
                  Board.movePiece(r, c, originalRow, originalColumn);
                  Board.setPiece(r, c, temp);
                  System.out.println("green not checkmate!!!!!");
                  System.out.println("piece on " + originalRow + " " + originalColumn);
                  System.out.println("went to " + r + " " + c);
                  return false;
                }
                Board.movePiece(r, c, originalRow, originalColumn);
                Board.setPiece(r, c, temp);
              }
            }
          }
        }
      }
    }

    //if method was called with red king
    if(super.getTeam() == false)
    {
      //scanning through entire board
      for(int r = 0; r <= 9; r++)
      {
        for(int c = 0; c <= 8; c++)
        {
          //no need to check if square is occupied by a teammate piece
          if (Board.getPiece(r, c) == null || Board.getPiece(r, c).getTeam() == true)
          {
            for(Piece p : Board.getRed())
            {
              if(p.canMove(r, c))
              {
                int originalRow = p.getRow();
                int originalColumn = p.getColumn();
                Piece temp = Board.getPiece(r, c);
                Board.movePiece(p.getRow(), p.getColumn(), r, c);
                if(!isInCheck(Board.getGreen()))
                {
                  Board.movePiece(r, c, originalRow, originalColumn);
                  Board.setPiece(r, c, temp);
                  System.out.println("red not checkmate!!!!!");
                  System.out.println("piece on " + originalRow + " " + originalColumn);
                  System.out.println("went to " + r + " " + c);
                  return false;
                }
                Board.movePiece(r, c, originalRow, originalColumn);
                Board.setPiece(r, c, temp);
              }
            }
          }
        }
      }
    }
    System.out.println("checkmate!!!!!! *default dances*");
    return true;
  }

  
}

/*
6 4 5 4
0 0 1 0
6 8 6 7 
1 0 1 3
7 7 5 7
0 8 1 8
6 0 6 1
1 8 1 5
9 0 3 0
0 1 2 2
5 4 5 5
2 1 2 4
8 4 8 5 (or 8 4 7 5)?
1 5 5 5
6 6 6 5
5 5 6 5 
8 5 8 4 (illegal move)
*/

/* third debugging (lmao)
9 0 8 0
3 4 4 4
8 0 8 3
4 4 5 4 
9 8 8 8
5 4 6 4
8 8 8 5
6 4 7 4
8 4 7 4
3 2 4 2
9 7 7 6
4 2 5 2
7 4 8 4
6 3 0 0     3 6 4 6 (monke)
magical rook appears at 6, 3
  */

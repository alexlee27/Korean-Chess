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
    return true;
  }
}

import java.lang.Math;
public class Guard extends Piece
{
  public Guard(boolean t, int r, int c)
  {
    super(t, r, c);
  }
  
  public boolean canMove(int r, int c)
  {
    if (destIsValid(r, c))
    {
      /* if (Math.abs(r - super.getRow()) <= 1 && Math.abs(c - super.getColumn()) <= 1)
      { */
        if(super.getTeam() == true)
        {  
          //if middle then move anywhere else
          if (super.getRow() == 8 && super.getColumn() == 4)
          {
            return true;
          }
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
        else
        {
          if (super.getRow() == 1 && super.getColumn() == 4)
          {
            return true;
          }
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
      //}
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
}
import java.lang.Math;
public class Pawn extends Piece
{
  public Pawn(boolean t, int r, int c)
  {
    super(t, r, c);
  }

  public boolean canMove(int r, int c)
  {
    //checks if destination is too far away horizontally
    if (Math.abs(super.getColumn() - c) > 1)
    {
      return false;
    }

    //check if destination is a teammate
    if (Board.getPiece(r, c) != null && Board.getPiece(r, c).getTeam() == super.getTeam())
    {
      return false;
    }

    //check if piece is trying to move vertically
    if(super.getColumn() == c)
    {
      if(this.getTeam() == true)
      {
        if(r - super.getRow() == -1)
        {
          return true;
        }
      }
      else
      {
        if(r - super.getRow() == 1)
        {
          return true;
        }
      }
    }
    //if moving horizontally, check if it's ONLY moving horizontally
    else if (r == super.getRow())
    {
      return true;
    }
    else
    {
      if (super.getTeam() == true)
      {
        if (super.getRow() - r == 1 && super.getRow() <= 2 && super.getColumn() >= 3 && super.getColumn() <= 5 && c >= 3 && c <= 5 && super.getRow() % 2 != super.getColumn() % 2 && r % 2 != c % 2)
        {
          return true;
        }
      }
      else
      {
        if (super.getRow() - r == -1 && super.getRow() >= 7 && super.getColumn() >= 3 && super.getColumn() <= 5 && c >= 3 && c <= 5 && super.getRow() % 2 == super.getColumn() % 2 && r % 2 == c % 2)
        {
          return true;
        }
      }
    }

    
    return false;
  }

  public String toString()
  {
    return "Pawn";
  }
}
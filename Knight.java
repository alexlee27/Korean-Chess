import java.lang.Math;
public class Knight extends Piece
{
  public Knight(boolean t, int r, int c)
  {
    super(t, r, c);
  }
  public boolean canMove(int r, int c)
  {
    int rBlockPoint = r;
    int cBlockPoint = c;
    if(destIsValid(r, c))
    {
      // first quadrant (TOP RIGHT) (FOR ALEX) (HE DOESN'T KNOW WHERE THE QUARANTS ARE)
      if (r - super.getRow() < 0 && c - super.getColumn() > 0)
      {
        rBlockPoint++;
        cBlockPoint--;
      }
      // second quadrant (top left)
      else if (r - super.getRow() < 0 && c - super.getColumn() < 0)
      {
        rBlockPoint++;
        cBlockPoint++;
      }
      // third quadrant (bottom left)
      else if (r - super.getRow() > 0 && c - super.getColumn() < 0)
      {
        rBlockPoint--;
        cBlockPoint++;
      }
      // fourth quadrant (bottom right)
      else if (r - super.getRow() > 0 && c - super.getColumn() > 0)
      {
        rBlockPoint--;
        cBlockPoint--;
      }
      if(Board.getPiece(rBlockPoint, cBlockPoint) == null)
      {
        return true;
      }
    }
    return false;
  }

  public boolean destIsValid(int r, int c)
  {
    if (Board.getPiece(r, c) == null || Board.getPiece(r, c).getTeam() != super.getTeam())
    {
      if (Math.abs(super.getRow() - r) == 1 && Math.abs(super.getColumn() - c) == 2)
      {
        return true;
      }
      else if (Math.abs(super.getRow() - r) == 2 && Math.abs(super.getColumn() - c) == 1)
      {
        return true;
      }
    }
    return false;
  }
}
  
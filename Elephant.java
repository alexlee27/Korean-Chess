public class Elephant extends Piece
{
  public Elephant(boolean t, int r, int c)
  {
    super(t, r, c);
  }

  public boolean canMove(int r, int c)
  {
    int rBlockPoint1 = r;
    int cBlockPoint1 = c;
    int rBlockPoint2 = r;
    int cBlockPoint2 = c;
    if(destIsValid(r, c))
    {
      // first quadrant (TOP RIGHT) (FOR ALEX) (HE DOESN'T KNOW WHERE THE QUARANTS ARE)
      if (r - super.getRow() < 0 && c - super.getColumn() > 0)
      {
        rBlockPoint1++;
        cBlockPoint1--;
        rBlockPoint2 += 2;
        cBlockPoint2 -= 2;
      }
      // second quadrant (top left)
      else if (r - super.getRow() < 0 && c - super.getColumn() < 0)
      {
        rBlockPoint1++;
        cBlockPoint1++;
        rBlockPoint2 += 2;
        cBlockPoint2 += 2;
      }
      // third quadrant (bottom left)
      else if (r - super.getRow() > 0 && c - super.getColumn() < 0)
      {
        rBlockPoint1--;
        cBlockPoint1++;
        rBlockPoint2 -= 2;
        cBlockPoint2 += 2;
      }
      // fourth quadrant (bottom right)
      else if (r - super.getRow() > 0 && c - super.getColumn() > 0)
      {
        rBlockPoint1--;
        cBlockPoint1--;
        rBlockPoint2 -= 2;
        cBlockPoint2 -= 2;
      }
      if(Board.getPiece(rBlockPoint1, cBlockPoint1) == null && Board.getPiece(rBlockPoint2, cBlockPoint2) == null)
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
      if (Math.abs(super.getRow() - r) == 2 && Math.abs(super.getColumn() - c) == 3)
      {
        return true;
      }
      else if (Math.abs(super.getRow() - r) == 3 && Math.abs(super.getColumn() - c) == 2)
      {
        return true;
      }
    }
    return false;
  }

  public String toString()
  {
    return "Elephant";
  }
}
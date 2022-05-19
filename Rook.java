import java.lang.Math;
public class Rook extends Piece
{
  public Rook(boolean t, int r, int c)
  {
    super(t, r, c);
  }

  public boolean canMove(int r, int c)
  {
    //check if destination is a teammate piece
    if (Board.getPiece(r, c) != null) 
    {
      if (Board.getPiece(r, c).getTeam() == super.getTeam())
      {
        return false;
      }
    }
    //makes sure the destination point is on the same row or column as the original point
    if (r == super.getRow() || c == super.getColumn())
    {
      //if to move horizontally (destination is on same row)
      if (r == super.getRow())
      {
        //checks if the piece is trying to move to the right
        if (super.getColumn() < c)
        {
          //check if everything between start and end is empty (would be blocked and can't move if not)
          for(int i = super.getColumn() + 1; i < c; i++)
          {
            if (Board.getPiece(r, i) != null)
            {
              return false;
            }  
          }
          return true;
        }

        //checks if the piece is trying to move to the left
        else
        {
          for(int i = super.getColumn() - 1; i > c; i--)
          {
            if (Board.getPiece(r, i) != null)
            {
              return false;
            }  
          }
          return true;
        }
      }
      //if to move vertically (same column)
      else if (c == super.getColumn())
      {
        //checks if the piece is trying to move up
        if (super.getRow() < r)
        {
          for(int i = super.getRow() + 1; i < r; i++)
          {
            if (Board.getPiece(r, i) != null)
            {
              return false;
            }
          }
          return true;
        }
        //checks if the piece is trying to move down
        else
        {
          for(int i = super.getRow() - 1; i > r; i--)
          {
            if (Board.getPiece(i, c) != null)
            {
              return false;
            }
          }
          return true;
        }
      }
      
    }
    else
    {
      //if destination and start are inside palace columns
      if ((c >= 3 && c <= 5) && (super.getColumn() >= 3 && super.getColumn() <= 5))
      {
        //if destination and start are in green team palace
        if (r >= 7 && super.getRow() >= 7)
        {
          //if start is on square where diagonal is available
          if (super.getRow() % 2 == super.getColumn() % 2)
          {
            //if destination is on square where diagonal is available
            if (r % 2 == c % 2)
            {
              //if it's moving from one corner to opposite corner
              if (Math.abs(r - super.getRow()) == 2)
              {
                //if middle is unoccupied
                if (Board.getPiece(8, 4) == null)
                {
                  return true;
                }
                //if middle is blocked (can't move)
                else
                {
                  return false;
                }
              }
              //when it is moving to the centre point of the palace
              return true;
            }
          }
            
        }
        if (r <= 2 && super.getRow() <= 2)
        {
          if (super.getRow() % 2 != super.getColumn() % 2)
          {
            if (r % 2 != c % 2)
            {
              //if it's moving from one corner to opposite corner
              if (Math.abs(r - super.getRow()) == 2)
              {
                //if middle is unoccupied
                if (Board.getPiece(1, 4) == null)
                {
                  return true;
                }
                //if middle is blocked (can't move)
                else
                {
                  return false;
                }
              }
              //if only trying to move one diagonal (already passed destination check)
              return true;
            }
          }
        }
      }
    }
    return false;
  }
}
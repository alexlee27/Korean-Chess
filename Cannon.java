import java.lang.Math;
public class Cannon extends Piece
{
  public Cannon(boolean t, int r, int c)
  {
    super(t, r, c);
  }

  public boolean canMove(int r, int c)
  {
    int piecesInBetween = 0;
    //makes sure the destination point is on the same row or column as the original point
    if (Board.getPiece(r, c) != null) 
    {
      //check if destination is a teammate piece
      if (Board.getPiece(r, c).getTeam() == super.getTeam())
      {
        return false;
      }

      //check if the destination is a cannon piece
      if(Board.getPiece(r, c) instanceof Cannon)
      {
        return false;
      }
    }
    
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
              piecesInBetween++;
            }
            if (Board.getPiece(i, c) instanceof Cannon)
            {
              return false;
            }
            if(piecesInBetween >= 2)
            {
              return false;
            }
            
          }
          if (piecesInBetween == 0)
          {
            return false;
          }
          else
          {
            return true;
          }
        }

        //checks if the piece is trying to move to the left
        else
        {
          for(int i = super.getColumn() - 1; i > c; i--)
          {
            if (Board.getPiece(r, i) != null)
            {
              piecesInBetween++;
            }
            if (Board.getPiece(i, c) instanceof Cannon)
            {
              return false;
            }
            if(piecesInBetween >= 2)
            {
              return false;
            }
          }
          if (piecesInBetween == 0)
          {
            return false;
          }
          else
          {
            return true;
          }
        }
      }
      //if to move vertically (same column)
      else if (c == super.getColumn())
      {
        //checks if the piece is trying to move down
        if (super.getRow() < r)
        {
          for(int i = super.getRow() + 1; i < r; i++)
          {
            if (Board.getPiece(i, c) != null)
            {
              piecesInBetween++;
            }
            if (Board.getPiece(i, c) instanceof Cannon)
            {
              return false;
            }
            if(piecesInBetween >= 2)
            {
              return false;
            }
            
          }
          if (piecesInBetween == 0)
          {
            return false;
          }
          else
          {
            return true;
          }
        }
          
        //checks if the piece is trying to move up
        else
        {
          for(int i = super.getRow() - 1; i > r; i--)
          {
            if (Board.getPiece(i, c) != null)
            {
              piecesInBetween++;
            }
            if (Board.getPiece(i, c) instanceof Cannon)
            {
              return false;
            }
            if(piecesInBetween >= 2)
            {
              return false;
            }
            
          }
          if (piecesInBetween == 0)
          {
            return false;
          }
          else
          {
            return true;
          }
        }
      }
      
    }
    //checks if piece is moving diagonally
    if ((c >= 3 && c <= 5) && (super.getColumn() >= 3 && super.getColumn() <= 5))
    {
      if ((r >= 7) && (super.getRow() >= 7))
      {
        //if start is on square where diagonal is available
        if (super.getRow() % 2 == super.getColumn() % 2)
        {
          //if destination is on square where diagonal is available
          if (r % 2 == c % 2)
          {
            if (Math.abs(r - super.getRow()) == 2)
            {
              if ((Board.getPiece(8, 4) != null) && !(Board.getPiece(8, 4) instanceof Cannon))
              {
                return true;
              }
            }
          }
        }
      }
      
      if ((r <= 2) && (super.getRow() <= 2))
      {
        if (super.getRow() % 2 != super.getColumn() % 2)
        {
          //if destination is on square where diagonal is available
          if (r % 2 != c % 2)
          {
            if (Math.abs(r - super.getRow()) == 2)
            {
              if ((Board.getPiece(1,4) != null) && !(Board.getPiece(1, 4) instanceof Cannon))
              {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }

  public String toString()
  {
    return "Cannon";
  }
}
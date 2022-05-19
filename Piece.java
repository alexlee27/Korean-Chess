import java.util.ArrayList;
public class Piece
{
  private boolean team; //blue = true, red = false
  
  //coordinates of the piece's location
  private int row;
  private int column;

  public Piece(boolean t, int r, int c)
  {
    team = t;
    row = r;
    column = c;
  }
  
  public boolean canMove(int r, int c)
  {
    return true;
  }

  //for King subclass; this is a dummy method and will return false for all other pieces
  public boolean isInCheck(ArrayList<Piece> enemies)
  {
    return false;
  }

  public int getRow()
  {
    return row;
  }
  public int getColumn()
  {
    return column;
  }
  public boolean getTeam()
  {
    return team;
  }
  public void setCoord(int r, int c)
  {
    row = r;
    column = c;
  }
}
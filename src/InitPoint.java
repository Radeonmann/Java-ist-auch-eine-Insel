import java.awt.*;

public class InitPoint
{

  static void clear( Point p )
  {
    p.setLocation( 0, 0 );
  }

  public static void main( String[] args )
  {
    Point q = new Point( 47, 11 );   // Koordinaten gesetzt auf (x=47,y=11)
    clear( q );
    System.out.println( q.x );     // 0
  }
}
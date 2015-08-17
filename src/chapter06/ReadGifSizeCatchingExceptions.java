package chapter06;

import java.io.*;

public class ReadGifSizeCatchingExceptions
{
  /**
   * File is not closed if Exception is thrown
   * @param args
   */
  public static void main( String[] args )
  {
    try
    {
      RandomAccessFile f = new RandomAccessFile( "duke.gif", "r" );
      f.seek( 6 );

      System.out.printf( "%s x %s Pixel%n", f.read() + f.read() * 256,
                         f.read() + f.read() * 256 );
      f.close();
    }
    catch ( FileNotFoundException e )
    {
      System.err.println( "Datei ist nicht vorhanden!" );
    }
    catch ( IOException e )
    {

      System.err.println( "Allgemeiner Ein-/Ausgabefehler!" );
    }
  }
}

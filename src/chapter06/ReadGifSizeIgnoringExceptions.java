package chapter06;

import java.io.*;

public class ReadGifSizeIgnoringExceptions
{
  public static void main( String[] args ) throws FileNotFoundException, IOException
  {
    RandomAccessFile f = new RandomAccessFile( "duke.gif", "r" );
    f.seek( 6 );

    System.out.printf( "%s x %s Pixel%n", f.read() + f.read() * 256,
                                          f.read() + f.read() * 256 );
    f.close();
  }
}

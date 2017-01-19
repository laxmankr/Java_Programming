import java.util.*;
public class ReadString {
	// TODO Auto-generated method stub
	// Read an unlimited number of String; return a String [ ]
	// The minimal I/O details used here are not important for
 // this example and are discussed in Section 2.6.
 public static String [ ] getStrings( )
	 {
	Scanner in= new Scanner( System.in );
	 String [ ] array = new String[ 5 ];
 int itemsRead = 0;
	System.out.println( "Enter strings, one per line; " );
 System.out.println( "Terminate with empty line: " );
	
	while(in.hasNextLine( ) )
	 {
	 String oneLine = in.nextLine( );
 if( oneLine.equals( "" ))
	 break;
	 if( itemsRead == array.length )
	 array = resize( array, array.length * 2 );
	 array[ itemsRead++ ] = oneLine;
	 }
	 return resize( array, itemsRead );
	 }
	
	// Resize a String[ ] array; return new array
	  public static String [ ] resize( String [ ] array,
	  int newSize )
	  {
	  String [ ] original = array;
	  int numToCopy = Math.min( original.length, newSize );
	  array = new String[ newSize ];
	  for( int i = 0; i < numToCopy; i++ )
	  array[ i ] = original[ i ];
	  return array;
	  }
	public static void main(String[] args) {
		String [ ] array = getStrings( );
		 for( int i = 0; i < array.length; i++ )
	 System.out.println( array[ i ] );
	}
	
}

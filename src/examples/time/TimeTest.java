package examples.time;

/**
 * @author Mohamed Elsayed
 */
public class TimeTest 
{
    public static void main( String[] args )
    {
        Time time = new Time();

        System.out.printf( "The initial universal time is: %s\n",
                time.toUniversalString() );
        System.out.printf( "The initial standard time is: %s\n",
                time.toString() );
        System.out.println(); // output a blank line
        
        // change time and output updated time
        time.setTime( 13, 27, 6 );
        System.out.printf( "Universal time after setTime is: %s\n",
                time.toUniversalString() );
        System.out.printf( "Standard time after setTime is: %s\n",
                time.toString() );
        System.out.println(); // output a blank line
        
        // attempt to set time with invalid values
        try
        {
            time.setTime( 99, 99, 99 ); // all values out of range
        }
        catch ( IllegalArgumentException e )
        {
            System.out.printf( "Exception: %s\n\n", e.getMessage() );
        }
        
        // display time after attempt to set invalid values
        System.out.println( "After attempting invalid settings:" );
        System.out.print( "Universal time: " );
        System.out.println( time.toUniversalString() );
        System.out.print( "Standard time: " );
        System.out.println( time.toString() );
    }
}

package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String name="";

		for(int i = 0; i < args.length; i++){
			name+=args[i]+" ";
 		}
		if( "".contentEquals(name) ) {
			System.out.println(   "Hello world!" );
			
		}
		else {
			System.out.println(   "Hello "+name+"!" );
		}
    }
}

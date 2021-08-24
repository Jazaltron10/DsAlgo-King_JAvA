// public class BinaryTrees {
// import java.io.*;
// import java.util.*;
// public class WoodChuck
// {
// 	public static void main(String args[]) throws Exception
// 	{
// 		HashMap<String,Integer> histogram = new HashMap<String,Integer>();
// 		BufferedReader infile = new BufferedReader( new FileReader( args[0] ) );
// 		while ( infile.ready() ) // .ready() true if there is another line in the file 
// 		{
// 			String word = infile.readLine();
// 			if ( !histogram.containsKey(word) )
// 				histogram.put( word, 1 );
// 			else
// 				histogram.put( word, histogram.get(word) + 1 ); // replace freq with freq+1 
// 		}	
// 		ArrayList<String> words = new ArrayList<String>( histogram.keySet() );
// 		Collections.sort( words );
// 		for ( String word : words )
// 			System.out.println( word + "\t" + histogram.get(word) );
// 	} // END MAIN
// } // CLASS WOODCHUCK    
// }

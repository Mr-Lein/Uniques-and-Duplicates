//Name -

import static java.lang.System.*;
import java.util.*;

public class UniquesDups
{
	public static void main( String args[] )
	{
		String list = "a b c d e f g h a b c d e f g h i j k"; 
		System.out.println("Original List : " + list);
		System.out.println("Uniques : " + getUniques(list));
		System.out.println("Dupes : " + getDupes(list) + "\n\n");
		
		list = "one two three one two three six seven one two";
		System.out.println("Original List : " + list);
		System.out.println("Uniques : " + getUniques(list));
		System.out.println("Dupes : " + getDupes(list) + "\n\n");
		
		list = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		System.out.println("Original List : " + list);
		System.out.println("Uniques : " + getUniques(list));
		System.out.println("Dupes : " + getDupes(list) + "\n\n");	
	}

  public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		//add code

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		
		return null;
	}
}

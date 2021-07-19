package labTwo;

import java.util.ArrayList;
import java.util.Collections;

public class SortedList 
{
		public static void main(String[] args)
		{
			//list of strings
			
			ArrayList<String> al = new ArrayList<String>();
			al.add("Apple Products");
			al.add("iPhone");
			al.add("Macbook");
			al.add("iPod");
			al.add("iPad");
			
			Collections.sort(al); //method

			System.out.println("List after the use of Collection.sort() :\n" + al);
		}
	}

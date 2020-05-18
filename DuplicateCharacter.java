package JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		List<Character> mylist =new ArrayList<Character>();
		String text="When life gives you lemons, make lemonade";
		int len=text.length();
		System.out.println("Duplicate characters are");
		for (int i=0;i<len;i++)
		{
			 
		  if (!mylist.contains(text.charAt(i)))
			  mylist.add(text.charAt(i));
		  else
			  System.out.print(text.charAt(i) +",");
		  
		   
			
		}
	}

}

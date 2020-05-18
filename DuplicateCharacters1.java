package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacters1 {
	public static void main(String[] args) {
		Set<Character> myset =new LinkedHashSet<Character>();
		String text="When life gives you lemons, make lemonade";
		int len=text.length();
	    char ch;
		System.out.println("Duplicate characters are");
		for (int i=0;i<len;i++)
		{
			  if (!myset.contains(text.charAt(i)))
				  myset.add(text.charAt(i));
			  else
				  System.out.print(text.charAt(i) +",");
			
			
		}
		 

}
}

package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintList1 {

	public static void main(String[] args) {
		List<Character> mylist =new ArrayList<Character>();
		String text="Bugatti Chiron";
		int len=text.length();
		System.out.println("The characters in the text are");
		for (int i=0;i<len;i++)
		{
			mylist.add(text.charAt(i));
			
		}
		System.out.println(mylist);
	}

}

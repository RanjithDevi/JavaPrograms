package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintList2 {

		public static void main(String[] args) {
			Set<Character> myset =new LinkedHashSet<Character>();
			String text="Bugatti Chiron";
			int len=text.length();
			System.out.println("The characters in the text are");
			for (int i=0;i<len;i++)
				myset.add(text.charAt(i));
			System.out.println(myset);
	}

}

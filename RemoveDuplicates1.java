package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates1 {
		public static void main(String[] args) {
			List<String> mylist =new ArrayList<String>();
			mylist.add("A");
			mylist.add("B");
			mylist.add("C");
			mylist.add("D");
			mylist.add("A");
			mylist.add("D");
			mylist.add("E");
			mylist.add("F");
			 
			System.out.println(" Characters in list are");
			System.out.println(mylist);
			System.out.println(" Characters in Set are");
			Set<String> myset = new LinkedHashSet<String>(mylist);
			System.out.println(myset);
			
		
			}

	}



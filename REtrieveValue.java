package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class REtrieveValue {
public static void main(String[] args) {
	List<Integer> mylist =new ArrayList<Integer>();
	mylist.add(1);
	mylist.add(2);
	mylist.add(3);
	mylist.add(4);
	mylist.add(5);
	mylist.add(6);
	mylist.add(7);
	mylist.add(8);
	mylist.add(9);
	int len=mylist.size();
	Integer ch;
	System.out.println(" Characters in list are");
	System.out.println(mylist);
	for (int i=0;i<len-1;i++)
	{
		 
		 ch=mylist.get(i); 
		 if (ch==7)
			 System.out.println("Retrieved value : "+ch);
		 
	   
	}
}
	 
}



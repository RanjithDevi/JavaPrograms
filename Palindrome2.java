package JavaPrograms;

public class palindrome {

	public static void main(String[] args) {
		String text="malayalam";
		String rev="";
		int len= text.length();
		for (int i=len-1;i>=0;i--)
		{
			 rev=rev+(text.charAt(i));
			 
		}
		 System.out.println("The reversed string is " +rev);
		 if (text.equalsIgnoreCase(rev))
			 System.out.println("The given string " +text+ " is a palindrome");
		 else
			 System.out.println("The given string " +text+ " is not palindrome");
	}
}
			 

	

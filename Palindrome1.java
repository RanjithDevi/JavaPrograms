package JavaPrograms;

public class palindrome1 {

	public static void main(String[] args) {
		String text= "malayalam";
		char[] ch=text.toCharArray();
		 
		 String rev="";
		for (int i=ch.length-1;i>=0;i--)
		{
			
			rev=rev+ch[i];
		}
	if (text.equalsIgnoreCase(rev))
		System.out.println( "Palindrome : " +text);
	else
		System.out.println( "Not a Palindrome : " +text);

	}

}
   
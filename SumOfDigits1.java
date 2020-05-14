package JavaPrograms;

public class SumOfDigits1 {

	public static void main(String[] args) {
		String text="asdf1qwer9as8d7";
		String rep= text.replaceAll("\\D","");
		System.out.println("Digits alone in the given string " +rep.trim());
		int total= Integer.parseInt(rep);
	    char[] ch= rep.toCharArray();
	    int s=0;
		for (int i=0;i<=ch.length-1;i++)
		{
			 	
			s=s+Character.getNumericValue(ch[i]);
		}
		System.out.println("Sum of digits alone in the given string " +text+ " is " +s); 
  }
}

package JavaPrograms;

public class StringOccurance1 {

	public static void main(String[] args) {
		String text= "You have no choice other than following me!";
		char[] ch=text.toCharArray();
		int s=0;
		for (int i=0;i<=ch.length-1;i++)
		{
			if ((ch[i]=='o')|| (ch[i]=='O'))
			  s=s+1;	
		}
		System.out.println("The character  o appeared " +s+ "times");
	}

}

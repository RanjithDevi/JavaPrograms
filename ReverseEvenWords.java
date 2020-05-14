package JavaPrograms;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text="When the world realise its own mistake, corona will dissolve automatically";
		String[] sp=text.split(" ");
		int len=sp.length;
		for (int i=0;i<=len-1;i++)
		{
			 if (i%2==0)
				 System.out.print(sp[i] +" ");
		    else
		    {
			  int k=sp[i].length();
			  for (int j=k-1;j>=0;j--)
				  System.out.print(sp[i].charAt(j));
			    
		    }
			 System.out.print(" ");
		}
		
		

	}

}

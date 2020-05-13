package JavaPrograms;

public class StringOccurance {

	public static void main(String[] args) {
		 String text="You have nO choice Other than following me !";
		 int len=text.length();
		 int k=0;
		 for (int i=0;i<len;i++)
		 {
			if (text.charAt(i)== 'o' ||text.charAt(i)== 'O' )
			   k++;
		 }
		 System.out.println("Occurance of o is " + k);
			
	}

}

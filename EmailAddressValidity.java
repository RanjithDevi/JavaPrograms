package JavaPrograms;

public class EmailAddressValidity {

	public static void main(String[] args) {
		String text="balaji.c@tunatap.co.uk";
		int len=text.length();
		String regular="";
	 	for (int i=0;i<=len-1;i++)
		{
			regular=text.replaceAll("[^0-9a-zA-Z._@]","");
		}
	 	System.out.println(regular);
	 	if (regular.length()==len)
			System.out.println("Output : true");
		else
			System.out.println("Output : False");
		

	}

}

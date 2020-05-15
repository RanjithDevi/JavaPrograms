package JavaPrograms;

public class UserNameValidity {

	public static void main(String[] args) {
		String text="Balaji_1";
		int len=text.length();
		String regular="";
	 	for (int i=0;i<=len-1;i++)
		{
			regular=text.replaceAll("[^0-9a-zA-Z._@$]","");
		}
	 	int k=regular.length();
	 	System.out.println("Length of the given string : "+k);
	 	System.out.println(regular);
	 	if ((k<8) || (k!=len))
			System.out.println("Output : False");
	 	if ((k>=8) && (k==len))
			System.out.println("Output : true");
	}
}

package JavaPrograms;

public class UpperLowerNumSpace {

	public static void main(String[] args) {
		String text="It is Work from Home not Work for Home";
		char[] ch=text.toCharArray();
		int len=text.length();
		int d=0,sp=0,l=0,u=0;
		
		for (int i=0;i<=len-1;i++)
		{
			 if (Character.isDigit(ch[i]))
				 d=d+1;
			 if (Character.isSpace(ch[i]))
				 sp=sp+1;
			 if (Character.isLowerCase(ch[i]))
				 l=l+1;
			 if (Character.isUpperCase(ch[i]))
				 u=u+1;
					
		}
		System.out.println("Given String is  " +text);
		System.out.println("Number of Digits in the given Text :  "+d);
		System.out.println("Number of Space in the given Space :  "+sp);
		System.out.println("Number of Lower case alphabets in the given Text :  "+l);
		System.out.println("Number of Upper case alphabets in the given Text :  "+u);

	}

}

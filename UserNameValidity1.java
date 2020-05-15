package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidity1 {

	public static void main(String[] args) {
		String text= "Balaji_1";
		String pattern = "[a-zA-Z0-9._@$]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(text);
		System.out.println(matcher.matches());
	}	

}

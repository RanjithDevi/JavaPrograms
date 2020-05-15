package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidity1 {

	 public static void main(String[] args) {
			String text="balaji.chandrasekaran@testleaf.com";
			String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
			Pattern compile = Pattern.compile(pattern);
			Matcher matcher = compile.matcher(text);
			System.out.println(matcher.matches());
			
  	}

}

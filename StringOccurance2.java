package JavaPrograms;

public class Strinoccurance2 {
	public static void main(String[] args) {
		String text= "You have no choice other than following me!";
		String str=text.replaceAll("[^o]","");
		System.out.println("Number of times O occured "+str.length());

}
}

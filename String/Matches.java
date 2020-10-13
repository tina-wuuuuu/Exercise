package String;

public class Matches {
//比對正式表示法
	// boolean matches (String regex);
	//regex:用來比對此字串的正式表示法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "1234";
		System.out.println(regex.matches("1234"));
		System.out.println(regex.matches("\\d{4}"));
		System.out.println(regex.matches("123"));
		System.out.println(regex.matches("\\d{3}"));
	}

}

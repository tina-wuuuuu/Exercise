package String;

public class Matches {
//��勵����ܪk
	// boolean matches (String regex);
	//regex:�ΨӤ�惡�r�ꪺ������ܪk
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "1234";
		System.out.println(regex.matches("1234"));
		System.out.println(regex.matches("\\d{4}"));
		System.out.println(regex.matches("123"));
		System.out.println(regex.matches("\\d{3}"));
	}

}

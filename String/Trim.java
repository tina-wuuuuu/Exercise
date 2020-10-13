package String;

public class Trim {
	//擷取空白
	// String trim()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "   I LIKE JAVA    ";
		String str = strCom.trim();
		System.out.println("未去除前後空格的字串="+strCom);
		System.out.println("去除前後空格的字串="+str);
	}

}

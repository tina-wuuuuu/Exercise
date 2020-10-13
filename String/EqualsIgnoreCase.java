package String;

public class EqualsIgnoreCase {
	//忽略大小寫判斷字串相等
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom1 = "I LIKE JAVA";
		String strCom2 = "i like java";
		boolean str = strCom1.equalsIgnoreCase(strCom2);
		System.out.println(str);
	}

}

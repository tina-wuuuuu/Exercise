package String;

public class Intern {
//��o�W�d�Ʀr��
	//String inter();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = new String ("I LIKE JAVA");
		String strCom2 = new String ("I LIKE JAVA");
		System.out.println(strCom.equals(strCom2));
		System.out.println(strCom==strCom2);
		System.out.println(strCom.intern()==strCom2.intern());
		
	}

}

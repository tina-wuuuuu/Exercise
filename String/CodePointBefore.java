package String;

public class CodePointBefore {
	//��o���ޫe�@�Ӧr�����{���I(�Ǧ^���w�Ȥ��e���r���ó]�w��int)
	//�Ǧ^���w���ޤ��e���r��(Unicode�{���I)�A���ްѦ�char��(Unicode�{���I)�A��d��1��r�����
	//int codePointBefore(in index);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointBefore(8);
		System.out.print(str);
	}

}

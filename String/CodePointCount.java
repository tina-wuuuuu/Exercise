package String;

public class CodePointCount {
	// ��o���w�d���r�{���I��(�d�����)
	// �Ǧ^��String �����w��r�d�򤤪�Unicode�{���I�ơC��r�d��l����w��beginIndex�A�@�������endIndex-1�B��char�C
	// �Ӥ�r�d����׬OendIndex-beginIndex�C
	// ��k�ŧi codePointCount(int beginIndex, int endIndex);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointCount(2, 5);
		System.out.println(str);
	}

}

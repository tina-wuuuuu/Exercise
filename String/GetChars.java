package String;

public class GetChars {
//��o�r���}�C
	//getChars(int srcBegin,int srcEnd,char []dst,int dstBegin);
	//srcBegin:�r�ꤤ�n�ƻs���Ĥ@�Ӧr��
	//srcEnd:�r�ꤤ�n�ƻs���̫�@�Ӧr��
	//dst:�ؼа}�C
	//dstBegin:�ؼа}�C�����_�l�����q
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		char [] dst = new char [10];
		strCom.getChars(0, 11, dst, 0);
		for(int i =0 ; i < dst.length ; i++ ) {
			System.out.println(dst[i]);
		}
	}

}

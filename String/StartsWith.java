package String;

public class StartsWith {
	//�P�_�r���r��
	//��k�ŧi boolean startsWith(String prefix , int toffset);
	//prefix:�r��
	//toffset:�r�ꤤ�}�l�M�䪺��m
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I like Java";
		boolean  str = strCom.startsWith(" ",1);
		System.out.println(str);
	//boolean startsWith(prefix)
		boolean str2 = strCom.startsWith("I");
		System.out.println(str2);
	}

}

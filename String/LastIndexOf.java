package String;

public class LastIndexOf {
//��o�r���̫᪺����
	// int lastIndexOf(int ch);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "abcdefg ghijklmna";
		int index = strCom.lastIndexOf("a");
		int index2 = strCom.lastIndexOf("k");
		System.out.println(index);
		System.out.println(index2);
		System.out.println();
		//int lastIndexOf(int ch,int fromIndex);
		//fromIndex:�}�l���ު���m(�ϦV�j��)�A
		int index3 = strCom.lastIndexOf("a", 5);
		int index4 = strCom.lastIndexOf("f", 6);
		int index5 = strCom.lastIndexOf("a", 17);

		System.out.println(index3);
		System.out.println(index4);
		System.out.println(index5);
		System.out.println();
		//int lastIndexOf(String str);
		String strCom2 = "�����ޡA����{���]�p����A����n��";
		int index6 = strCom2.lastIndexOf("����");
		System.out.println(index6);
		System.out.println();
		//int lastIndexOf(String str,int fromIndex)
		int index7 = strCom2.lastIndexOf("����", 9);
		System.out.println(index7);
	}

}

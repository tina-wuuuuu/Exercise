package String;

public class RegionMatches {
//���ը�Ӧr��ϰ�O�_�۵�
	// ��k�ŧi boolean regionMatches(boolean ignoreCase, int toffset, String other, int
	// ooffser, int len)
	// ignoreCase:�p�G��true�A����r���ɩ����j�p�g
	// toffset:�r�ꤤ�l�ϰ쪺�_�l�����q
	// other:�r��Ѽ�
	// ooffset:�r��ѼƤ��l�ϰ쪺�_�l�����q
	// len:�n������r����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "ABLIKE";
		String strCom2 = "CDlike";
		// �����r��
		boolean a = strCom.regionMatches(true, 2, strCom2, 0, 2);
		System.out.println(a);
		boolean a1 = strCom.regionMatches(false, 2, strCom2, 2, 4);
		//ignoreCase��false���G�Nfalse
		System.out.println(a1);
		boolean b = strCom.regionMatches(true, 2, strCom2, 2, 4);
		System.out.println(b);
		boolean c = strCom.regionMatches(true, 2, strCom2, 2, 5);
		//len:5�W�L�r����׵��Gfalse
		System.out.println(c);
		boolean d  = strCom.regionMatches(true, -2, strCom2, 2, 5);
		//toffset.ooffset�䤤���@�Ȭ��t���Gfalse
		System.out.println(d);
		System.out.println();
		String strCom3 = "CDLIKE";
		boolean b2 = strCom.regionMatches(true, 2, strCom3, 2, 4);
		//��������A�������j�p�g
		System.out.println(b2);
		boolean a2 = strCom.regionMatches(true, 2, strCom3, 0, 2);
		System.out.println(a2);

	}

}

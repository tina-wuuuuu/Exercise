package String;

public class OffsetByCodePoints {
//��o���ް�������w�{���I������
	//int offsetByCodePoints(int index,int codePointOffset)
	//index:�n����������
	//CodePointOffset:�{���I���������q
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int i = strCom.offsetByCodePoints(2, 3);//�q����2����3�ӵ{���I�����ޡA��X��5
		System.out.println(i);
	}

}

package String;

public class Split {
	// �r����Φ��}�C
	// ��k�ŧi String [] split (String regex)
	// regex:���w���r����βŸ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���q�W�١G�����ޡI���q�Ҧb�a�G�x�_���C���q�q�ܡG0222990314";
		String[] info = null;
		info = str.split("�I|�C");
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
		System.out.println();

		String str2 = "���c�������A����]���A���c�]���A�n�@";
		String[] info2 = null;
		info2 = str2.split("�A");
		for (int i = 0; i < info2.length; i++) {
			System.out.println(info2[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		// ��k�ŧi String [] split(String regex,int limit)
		// limit:����Ҧ����Ϊ�����
		String[] info3 = null;
		info3 = str2.split("�A", 0);
		for (int i = 0; i < info3.length; i++) {
			System.out.println(info3[i]);
		}
		System.out.println();

		String[] info5 = null;
		info5 = str2.split("�A", 1);
		for (int i = 0; i < info5.length; i++) {
			System.out.println(info5[i]);
		}
		System.out.println();

		String[] info4 = null;
		info4 = str2.split("�A", 2);
		for (int i = 0; i < info4.length; i++) {
			System.out.println(info4[i]);
		}
		System.out.println();

		String[] info6 = null;
		info6 = str2.split("�A", 3);
		for (int i = 0; i < info6.length; i++) {
			System.out.println(info6[i]);
		}
		System.out.println();

		String[] info7 = null;
		info7 = str2.split("�A", 4);
		for (int i = 0; i < info7.length; i++) {
			System.out.println(info7[i]);
		}
	}

}

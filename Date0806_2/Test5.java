package Date0806_2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ӫ��r�ꪫ��Y�S���䥦�W�٨ӰѦҥ��A
		// �N�|�b�A���ɾ��QJava���u�U���^���v�]Garbage collection�^����^��
		String str = "just";
		// ���̨�ӬO���P���r�ꪫ��A
		// �ä��O�b "just"�r���[�W"in"�r��A
		// �ӬO��str�W�ٰѦҦܷs���r�ꪫ��
		str = "justin";
		// ----
		String str11 = "flyweight";
		String str22 = "flyweight";
		// ��ڤW�O���V�P�@�Ӧr�ꪫ��
		System.out.println(str11 == str22);
		// ----
		System.out.println();
		// ----
		String str1 = "fly";
		String str2 = "weight";
		String str3 = "flyweight";
		String str4;
		str4 = str1 + str2;
		// ���str3�Pstr4����O�_���P�@����ɡA���G�|�Ofalse
		System.out.println(str3 == str4);
		// intern()��k�|���ˬd String Pool���O�_�s�b�r�������ۦP���r�ꪫ��A
		// �p�G�����ܴN�Ǧ^�A�ѩ�{�������e�w�g��"flyweight"�r�ꪫ��A
		// intern()�bString Pool���o�{�F���A�ҥH�����Ǧ^
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
		// ----
		System.out.println();
		// ----
		String str111 = new String("caterpillar");
		String str222 = new String("caterpillar");
		//== �B��bJava���Q�ΨӤ����ӦW�٬O�_�ѦҦܦP�@����
		//���G�|�Ofalse
		System.out.println(str111 == str222);
		//�p�G�n�����ӡ]�r��^����O�_�ۦP�A�n�ϥ�equals()��k
		String str1111 = new String("caterpillar");
		String str2222 = new String("caterpillar");
		System.out.println(str1111.equals(str2222));
	}

}

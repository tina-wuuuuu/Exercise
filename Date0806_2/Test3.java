package Date0806_2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "�r�ꪺ�ϥ�";
		System.out.println(text);
		String msg = "���o�I";
		// �r�ꪺ�걵�bJava���i�H�����ϥ� + �B��l�A+ ���ӬO�[�k�B��l�A
		// �ӥ��Q�����]Override�^���i�H�����Ω�r�ꪺ�걵
		msg = msg + "Java Programming�I";
		System.out.println(msg);
		// -----
		System.out.println();
		// -----
		String text2 = "hello";
		System.out.println("�r�ꤺ�e: " + text2);
		System.out.println("�r�����: " + text2.length());
		System.out.println("����hello? " + text2.equals("hello"));
		System.out.println("�ର�j�g: " + text2.toUpperCase());
		System.out.println("�ର�p�g: " + text2.toLowerCase());
		// -----
		System.out.println();
		// -----
		// Byte.parseByte(�r��) �N�r���R���줸
		// Short.parseShort(�r��) �N�r���R��short���
		// Integer.parseInt(�r��) �N�r���R��integer���
		// Long.parseLong(�r��) �N�r���R��long���
		// Float.parseFloat(�r��) �N�r���R��float�B�I��
		// Double.parseDouble(�r��)�N�r���R��double�B�I��
		// char charAt(int index) �Ǧ^���w���޳B���r��
		// int indexOf(int ch) �Ǧ^���w�r���Ĥ@�ӧ�쪺���ަ�m
		// int indexOf(String str) �Ǧ^���w�r��Ĥ@�ӧ�쪺���ަ�m
		// int lastIndexOf(int ch) �Ǧ^���w�r���̫�@�ӧ�쪺���ަ�m
		// String substring(int beginIndex) ���X���w���޳B�ܦr����ݪ��l�r��
		// String substring(int beginIndex, intendIndex)���X���w���޽d��l�r��
		// char[] toCharArray() �N�r���ഫ���r��Array
		String text3 = "Your left brain has nothing right.\n" + "Your right brain has nothing left.\n";
		System.out.println("�r�ꤺ�e: ");
		// �C�L�X�r�ꤺ�e
		for (int i = 0; i < text3.length(); i++)
			System.out.print(text3.charAt(i));
		// ��indexof�Ǧ^�Ĥ@��left�����ޭ�
		System.out.println("\n�Ĥ@��left: " + text3.indexOf("left"));
		// ��lastIndexof�Ǧ^�̫�@��left�����ޭ�
		System.out.print("�̫�@��left: " + text3.lastIndexOf("left"));
		// �N�r����^�r��
		char[] charArr = text3.toCharArray();
		System.out.println("\n�r��Array���e: ");
		// �C�L�r��
		for (int i = 0; i < charArr.length; i++)
			System.out.print(charArr[i]);
		// ----
		// �ϥΦr���}�Cname�A�غc�X�@�Ӥ��e��"caterpillar"���r��C
		char[] name = { 'c', 'a', 't', 'e', 'r', 'p', 'i', 'l', 'l', 'a', 'r' };
		String str = new String(name);
		System.out.println(str);

	}

}

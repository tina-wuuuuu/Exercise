package Date0805_1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���w�r���s�X�ӿ�X"Hello"�o�q��r
		System.out.println("\u0048\u0065\u006C\u006C\u006F"+"\n");

		int x = 19;
		// �ন�G�i�� 10011
		System.out.println(Integer.toBinaryString(x));
		// �ন�Q���i�� 13
		System.out.println(Integer.toHexString(x));
		// �ন�K�i�� 23
		System.out.println(Integer.toOctalString(x)+"\n");

		// ��X 19 ���Q�i����
		System.out.printf("%d%n", 19);
		// ��X 19 ���K�i����
		System.out.printf("%o%n", 19);
		// ��X 19 ���Q���i����
		System.out.printf("%x%n"+"\n", 19);

		// ��X�B�I�Ʈɫ��w���
		System.out.printf("example:%.2f%n", 19.234);
		// ���w��X�ɡA�ܤ֭n�w�d���r���e��
		System.out.printf("example:%6.2f%n", 19.234);

	}

}

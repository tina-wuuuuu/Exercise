package Date0715;

public class Ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �г]�p�i�H��X�U�C��� �{����� ex3_1.java
		 */
		System.out.println("ex3_1.java");
		// �ק�ch3_6���~�אּ150�A�C���O�אּ1_0000�A�p��@�~�i�H�s�h�ֿ�
		final int hourly_salary, monthly_fee, year_savings;
		hourly_salary = 150;
		monthly_fee = 10000;
		year_savings = hourly_salary * 8 * 300 - monthly_fee * 12;
		System.out.println("�@�~�i�H�s" + year_savings + "��");
		// ----
		System.out.println();
		// �]�w�x�Ϊ��e�A��X���n�M�P���C
		double length, width, area, permeter;
		length = 10.5;
		width = 5.6;
		permeter = length * 2 + width * 2;
		area = length * width;
		System.out.println("�x�ΩP����:" + permeter);
		System.out.println("�x�έ��n��:" + area);
		// ----------
		System.out.println();
		// -----------
		// �ЦC�XUnicode�X65��90�����r��
		char ch = 65;
		for (ch = 65; ch <= 90; ch++) {
			System.out.print(ch);
		}
		// ----------
		System.out.println();
		// ----------
		// �Ыŧi��W�`��PI=3.14159�A��r=10�M20�ɡA�D�ꭱ�n�M�P���C
		double PI = 3.14159;
		double r, circle_area, circle_permeter;
		r = 10;
		circle_area = PI * r * r;
		circle_permeter = 2 * PI * r;
		System.out.println("��b�|=" + r + "�ꭱ�n��" + circle_area + "\r\n" + "��b�|=" + r + "��P����" + circle_permeter);
		r = 20.5;
		circle_area = PI * r * r;
		circle_permeter = 2 * PI * r;
		System.out.println("��b�|=" + r + "�ꭱ�n��" + circle_area + "\r\n" + "��b�|=" + r + "��P����" + circle_permeter);
		// ----------
		// �ŧi�`��IN����1.05%�AIN�O�Ȧ�~�Q�v�A�p���s�ڪ��B��50W.100W�ɡA�b�~�᥻���[�Q��=?
		double IN = 0.00105, sa, sb;
		int saving_a = 500000, saving_b = 1000000;
		sa = (saving_a * IN) / 2 + saving_a;
		sb = (saving_b * IN) / 2 + saving_b;
		System.out.println("���Q�U�b�~�[������:" + sa);
		System.out.println("���Q�U�b�~�[������:" + sb);
		// ---------
		System.out.println();
		// �C�X2�i��.8�i��.16�i�쪺��(100.55.299.399.86)
		// %d�Q�i���X�A%o�K�i��A%h�Q���i��A%n����A%b��X���L�ȡA%s�r��
		int a = 100, b = 55, c = 299, d = 399, e = 86;
		// ------
		Integer.toBinaryString(a);
		Integer.toBinaryString(b);
		Integer.toBinaryString(c);
		Integer.toBinaryString(d);
		Integer.toBinaryString(e);
		// ------�G�i��
		System.out.println("�Q�i����G�i��" + Integer.toBinaryString(a));
		System.out.println("�Q�i����G�i��" + Integer.toBinaryString(b));
		System.out.println("�Q�i����G�i��" + Integer.toBinaryString(c));
		System.out.println("�Q�i����G�i��" + Integer.toBinaryString(d));
		System.out.println("�Q�i����G�i��" + Integer.toBinaryString(e));
		// ----
		System.out.println();
		// ------
		System.out.printf(a + "�H�K�i����:%o%n", a);
		System.out.printf(b + "�H�K�i����:%o%n", b);
		System.out.printf(c + "�H�K�i����:%o%n", c);
		System.out.printf(d + "�H�K�i����:%o%n", d);
		System.out.printf(e + "�H�K�i����:%o%n", e);
		System.out.println();
		System.out.printf(a + "�H�Q���i����:%h%n", a);
		System.out.printf(b + "�H�Q���i����:%h%n", b);
		System.out.printf(c + "�H�Q���i����:%h%n", c);
		System.out.printf(d + "�H�Q���i����:%h%n", d);
		System.out.printf(e + "�H�Q���i����:%h%n", e);
		// -------------
		System.out.println();
		// �N�U�C���ର10�i��
		int x, y, z;
		x = 0b11110010;
		System.out.println("�C�L0b11110010����:" + x);
		y = 076543;
		System.out.println("�C�L076543����:" + y);
		z = 0xaaabbb;
		System.out.println("�C�L0zaaabbb����:" + z);

	}

}

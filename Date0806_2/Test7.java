package Date0806_2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[abc] a�Bb��c
		//[^abc] �Da�Bb�Bc���䥦�r��
		//[a-zA-Z] a��z��A��Z�]�d��^
		//[a-d[m-p]] a��d��m��p�]�p���^
		//[a-z&&[def]] d�Be��f�]�涰�^
		//[a-z&&[^bc]] a��z�A���Fb�Pc���~�]��^
		//[a-z&&[^mp]]
		//a��z�B�S��m��p�]a-lq-z�^�]��^ 
		//X? X�X�{�@���Χ����S�� 
		//X* X�X�{�s���Φh��
		//X+ X�X�{�@���Φh��
		//X{n} X�X�{n��
		//X{n,} X�X�{�ܤ�n��
		//X{n,m}�X�{�ܤ�n���A�����W�Lm�� 
		
		
		Scanner scanner = new Scanner(System.in);

		String str = "abcdefgabcabc";
		// �FreplaceAll()��k�i�H�N�ŦX���W��ܦ����l�r��m�������w���r��
		System.out.println(str.replaceAll(".bc", "###"));

		System.out.print("��J������X: ");
		//���o��J���X
		str = scanner.next();

		// ²��榡����
		if (str.matches("[0-9]{4}-[0-9]{6}"))
			System.out.println("�榡���T");
		else
			System.out.println("�榡���~");

		System.out.print("��Jhref����: ");
		// Scanner��next()��k�O�H�ťլ��Ϲj
		// �ڭ̪���J���ťաA�ҥH�n����⦸
		str = scanner.next() + " " + scanner.next();

		// ����href����
		if (str.matches("<a.+href*=*['\"]?.*?['\"]?.*?>"))
			System.out.println("�榡���T");
		else
			System.out.println("�榡���~");

		System.out.print("��J�q�l�l��: ");
		str = scanner.next();

		// ���ҹq�l�l��榡
		if (str.matches("^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$"))
			System.out.println("�榡���T");
		else
			System.out.println("�榡���~");
		scanner.close();
	}

}

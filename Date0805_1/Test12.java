package Date0805_1;

import java.util.Scanner;

public class Test12 {
	//�P�_�ϥΪ̪���J�O�_���٬O����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�Ʀr: ");
		int input = scanner.nextInt();
		//remain=��J�Ʀr%2
		int remain = input % 2;
		//remain�l��=1�A��ܩ_��
		if (remain == 1)
			System.out.println(input + "���_��");
		else//������1�A��ܰ���
			System.out.println(input + "������");
		scanner.close();
	}

}

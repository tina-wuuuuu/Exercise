package Date0805_2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int replay = 0;
		//���٫᫵
		do {
			System.out.print("��J��ƭȡG");
			//���o��J��ƭ�
			input = scanner.nextInt();
			//��J����%2=1���Y�A���������N
			System.out.println("��J�Ƭ��_�ơH" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("�~��(1:�~�� 0:����)�H");
			//���o��J��
			replay = scanner.nextInt();
			//��J��=1�~��j��A������1�����j��
		} while (replay == 1);
		scanner.close();
	}

}

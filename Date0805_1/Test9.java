package Date0805_1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������󦨥߮ɥHtrue��ܡA��������󤣦��߮� �Hfalse��ܡA
		System.out.println("10 > 5 -> " + (10 > 5));
		System.out.println("10 >= 5 -> " + (10 >= 5));
		System.out.println("10 < 5 -> " + (10 < 5));
		System.out.println("10 <= 5 -> " + (10 <= 5));
		System.out.println("10 == 5 -> " + (10 == 5));
		System.out.println("10 != 5 -> " + (10 != 5)+"\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�ǥͤ���: ");
		int scoreOfStudent = scanner.nextInt();
		// �u����B��l�v �]Conditional operator�^�G
		// ���� ? ���߶Ǧ^�� : ���ѶǦ^��
		// ����B��l���Ǧ^�Ȩ̱��󦡪����G�өw�A
		// �p�G���󦡪����G��true�A�h�Ǧ^�_���e���ȡA�Y��false�A�h�Ǧ^�_���᪺�ȡA
		System.out.println("�ӥͬO�_�ή�? " + (scoreOfStudent >= 60 ? '�O' : '�_'));

		System.out.print("�п�J�Ʀr: ");
		int inputedNumber = scanner.nextInt();
		//���J���Ƭ��_�ƮɡA�N����Q2�㰣�A�ҥH�l�Ƥ@�w���O0�A
		//�b���󦡤��P�_��true�A�]�ӶǦ^�r�� '�O' �A�Y�ƭȬ����ơA�h2�㰣�A
		//�ҥH�l�Ƭ�0�A�b���󦡤��P�_��false�A�ҥH�Ǧ^�r�� '�_'�C
		System.out.println("�O�_���_��? " + (inputedNumber % 2 != 0 ? '�O' : '�_'));
		scanner.close();
	}

}

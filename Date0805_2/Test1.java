package Date0805_2;

import java.util.Scanner;

public class Test1 {
//�P�_�ǥͤ��Ƶ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("��J���ơG");

		int score = scanner.nextInt();
		//�p�G���Ƥj�󵥩�90�oA�A���ŦX���U�@��else if
		if (score >= 90)
			System.out.println("�oA");
		//�p�G���Ƥj�󵥩�80�oB�A���ŦX���U�@��else if
		else if (score >= 80 && score < 90)
			System.out.println("�oB");
		else if (score >= 70 && score < 80)
			System.out.println("�oC");
		else if (score >= 60 && score < 70)
			System.out.println("�oD");
		//�H�Wif else if�]�������ŦX�̫�]else�oE
		else
			System.out.println("�oE(���ή�)");
		scanner.close();
	}

}

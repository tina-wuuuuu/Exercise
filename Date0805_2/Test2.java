package Date0805_2;

import java.util.Scanner;

public class Test2 {
//�W�@�ӽd��(Test1)�����Z���Ť��p��ϥ�switch�ӧ�g
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("�п�J����: ");
		int score = scanner.nextInt();
		//level=��J������/10
		int level = (int) score / 10;
		//�b�@�}�Yswitch���A�������X�ܼƪ��ȡA�M��v�@���U����case
		//�J��ƦX����ɡAswitch�N�����W���F�A
		//�L�k�bswitch���զX���������󳯭z�A�N�o�ϥ�if�F
		switch (level) {
		case 10:
		case 9:
			System.out.println("�oA");
			//�J��break���}switch�϶�
			break;
		case 8:
			System.out.println("�oB");
			break;
		case 7:
			System.out.println("�oC");
			break;
		case 6:
			System.out.println("�oD");
			break;
		//�p�G�S���ŦX���ƭȩΦr���A�h�|����default�᪺���z�y
		default:
			System.out.println("�oE(���ή�)");
		}
		scanner.close();
	}

}

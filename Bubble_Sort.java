package Date0722;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ϥή�w�ƧǥѤj��p
		int[] score = { 10, 32, 5, 78, 5 };
		int tmp;
		for (int i = 0; i < (score.length - 1); i++) {
			for (int j = 0; j < (score.length - 1); j++) {
				if (score[j] < score[j + 1]) {
					tmp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = tmp;
				}
			}

			System.out.printf("�C�X��%d�����j��Ƨǵ��G\n", (i + 1));
			for (int sc : score) {
				System.out.printf("%d", sc);
				System.out.print("\t");
			}
			System.out.println();

		}
	}

}

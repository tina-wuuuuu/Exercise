package Date0805_2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		//���J-1�ɵ��Ƥ]�|�Q��J�A�ҥH��l�ȭn�O-1����O0
		int count = -1;
		//����Ƶ���-1�ɰ���j��A������-1�~��]
		while (score != -1) {
			count++;
			sum += score;
			System.out.print("��J����(-1����)�G");
			//���o���Ƹ��
			score = scanner.nextInt();
		}

		System.out.println("�����G" + (double) sum / count);
		scanner.close();
	}

}

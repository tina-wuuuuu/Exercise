package Date0806_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 93, 5, 3, 55, 57, 7, 2, 73, 41, 91 };

		System.out.print("�Ƨǫe: ");
		//�C�L�X�Ƨǫearr�}�C
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		//�Ƨ�arr�Ѥp��j(�ֳt�ƧǪk)
		Arrays.sort(arr);
		//�C�L�Ƨǫ�arr
		System.out.print("�Ƨǫ�: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.print("\n�п�J�j�M��: ");
		//���o�j�M��
		int key = scanner.nextInt();
		//�}�C�q0�}�l�Abinarysearch�䤣��ȷ|�ǭt�ȡA�ҥHfind>-1�^�ǯ��ޭ�find<=-1�h�䤣����ޭ�
		int find = -1;
		//��w�ƧǪ��}�C�i��G���j�M�A�p�G�����w���ȴN�Ǧ^�ӭȩҦb�����ޡA�_�h�N��^�t�� 
		if ((find = Arrays.binarySearch(arr, key)) > -1) {
			System.out.println("���ȩ���� " + find + " ��m");
		} else
			System.out.println("�䤣����w��");
		scanner.close();
	}

}

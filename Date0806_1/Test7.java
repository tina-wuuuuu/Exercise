package Date0806_1;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr1.2.3�Ŷ���=10
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		//�Narr1.2 �Ŷ�����5
		Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 5);
		//�Narr3 �Ŷ���10
		Arrays.fill(arr3, 10);
		//��ڭ̰t�m�@�Ӱ}�C����A��|�̸�ƫ��A�ӵ��w�w�]�ȡA�Ҧp��ư}�C�N��l�� 0�A
		//�i�H�ϥ�Arrays.fill()��k�ӱN�Ҧ��������]�w�����w����
		System.out.print("arr1: ");
		//�C�L�Xarr1
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		//�Narr1��arr2.3����O�_�۵�
		System.out.println("\narr1 = arr2 ? " + Arrays.equals(arr1, arr2));
		System.out.println("arr1 = arr3 ? " + Arrays.equals(arr1, arr3));
		//Arrays.equals(,)�����Ӱ}�C���������ȬO�_�����۵��A�p�G�O�N�Ǧ^true�A�_�h�Ǧ^ false 
	}

}

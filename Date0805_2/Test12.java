package Date0805_2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�JArray�j�p: ");
		// ���o��J�j�p
		int length = scanner.nextInt();
		// �N��J�Ȱt�m��arr
		int[] arr = new int[length]; // �ʺA�t�m����
		// �C�L��J��
		System.out.println("Array����: " + arr.length);
		System.out.print("���e: ");
		// �C�L�}�C
		for (int i = 0; i < arr.length; i++)
			// �}�C�w�]�ȷ|�O0
			System.out.print(arr[i] + " ");
		System.out.println();
		scanner.close();
	}

}

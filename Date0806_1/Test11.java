package Date0806_1;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//copyOf()���ĤG�Ӥ޼ƫ��w�n�إߪ��s�}�C���סA
		//�p�G�s�}�C�����׶W�L��}�C�����סA�h�O�d�}�C�w�]��
		//�Ŷ�5���l�ȳ��O0
		int[] arr2 = Arrays.copyOf(arr1, 10);
		//�C�Larr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

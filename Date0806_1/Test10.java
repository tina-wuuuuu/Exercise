package Date0806_1;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//Arrays��copyOf()��k�Ǧ^���}�C�O�s���}�C����A�ҥH�z���ܶǦ^�}�C���������ȡA�]���|�v�T��Ӫ��}�C�C
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		//�C�Larr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

package Date0806_1;

import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr3 = { { 0, 1, 3 }, { 4, 6, 4 }, { 7, 8, 9 } };
		//��}�C�@�`�h����A²�檺���A�z�i�H��G�����ܤT���H�W���}�C�i�����O�_�۵� 
		System.out.println("arr1 equals arr2? " + Arrays.deepEquals(arr1, arr2));
		System.out.println("arr1 equals arr3? " + Arrays.deepEquals(arr1, arr3));
		//�N�}�C�ȧ@�`�h��X�A²�檺���A�z�i�H��G�����ܤT���H�W���}�C��X��r��� 
		System.out.println("arr1 deepToString()\n\t" + Arrays.deepToString(arr1));
	}

}

package Date0806_1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//arr2�Ŷ�5
		int[] arr2 = new int[5];
		//System.arraycopy(�ӷ�, �_�l����, �ت�, �_�l����, �ƻs����);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//�C�Larr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

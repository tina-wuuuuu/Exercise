package Date0806_2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		// -----
		System.out.println();
		// -----
		int[] arr0 = { 1, 2, 3, 4, 5 };
		// element的宣告必須在for()之中
		// 數字foreach
		for (int element : arr0)
			System.out.print(element + " ");
		// -----
		System.out.println();
		// -----
		// 字串foreach
		String[] names = { "caterpillar", "momor", "bush" };
		for (String name : names)
			System.out.print(name + " ");
		// -----
		System.out.println();
		// -----
		// 二維foreach
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : arr2)
			for (int element : row)
				System.out.print(element+" ");
		// -----
		System.out.println();
		// -----
		// 三維foreach
		int[][][] arr3 = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } } };
		for (int[][] row3 : arr3)
			for (int[] a1 : row3)
				for (int x : a1)
					System.out.print(x + " ");
	}

}

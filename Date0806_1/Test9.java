package Date0806_1;

import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr3 = { { 0, 1, 3 }, { 4, 6, 4 }, { 7, 8, 9 } };
		//對陣列作深層比較，簡單的說，您可以對二維仍至三維以上的陣列進行比較是否相等 
		System.out.println("arr1 equals arr2? " + Arrays.deepEquals(arr1, arr2));
		System.out.println("arr1 equals arr3? " + Arrays.deepEquals(arr1, arr3));
		//將陣列值作深層輸出，簡單的說，您可以對二維仍至三維以上的陣列輸出其字串值 
		System.out.println("arr1 deepToString()\n\t" + Arrays.deepToString(arr1));
	}

}

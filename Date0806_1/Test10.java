package Date0806_1;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//Arrays的copyOf()方法傳回的陣列是新的陣列物件，所以您改變傳回陣列中的元素值，也不會影響原來的陣列。
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		//列印arr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

package Date0806_1;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//copyOf()的第二個引數指定要建立的新陣列長度，
		//如果新陣列的長度超過原陣列的長度，則保留陣列預設值
		//空間5後其餘值都是0
		int[] arr2 = Arrays.copyOf(arr1, 10);
		//列印arr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

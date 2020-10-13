package Date0806_1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用 = 指定時是將物件指定給陣列名稱來參考，而不是陣列複製，
		//如果您想將整個陣列的值複製給另一個陣列該如何作呢？
		//您可以使用迴圈，將整個陣列的元素值走訪一遍，並指定給另一個陣列相對應的索引位置
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		//將arr1索引值複製到arr2
		for (int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];
		//列印arr2
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
	}

}

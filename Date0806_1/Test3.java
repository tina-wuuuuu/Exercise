package Date0806_1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用 = 指定時是將物件指定給陣列名稱來參考
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 6, 7 };
		int[] tmp;
//tmp可以參考至5個元素的一維陣列，也可以參考至3個元素的一維陣列。
		tmp = arr1;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");
		System.out.println();

		tmp = arr2;
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");
		System.out.println();
	}

}

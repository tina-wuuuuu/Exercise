package Date0806_1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] tmp1;
		int[] tmp2;
		//使用 = 指定時是將物件指定給陣列名稱來參考
		tmp1 = arr1;
		tmp2 = arr1;
		//列印出tmp1
		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		//列印出tmp2
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");
		System.out.println();
		//將tmp1[2]的值3換成9
		tmp1[2] = 9;
		for (int i = 0; i < tmp1.length; i++)
			System.out.print(tmp1[i] + " ");
		System.out.println();
		//有三個參考名稱參考至同一個陣列物件，也就是arr1、tmp1與tmp2，
		//所以您應該也知道，arr1索引2的值在程式執行後所參考到的值也改變了。 
		for (int i = 0; i < tmp2.length; i++)
			System.out.print(tmp2[i] + " ");
		System.out.println();
	}

}

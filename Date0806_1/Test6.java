package Date0806_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 93, 5, 3, 55, 57, 7, 2, 73, 41, 91 };

		System.out.print("排序前: ");
		//列印出排序前arr陣列
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		//排序arr由小到大(快速排序法)
		Arrays.sort(arr);
		//列印排序後arr
		System.out.print("排序後: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.print("\n請輸入搜尋值: ");
		//取得搜尋值
		int key = scanner.nextInt();
		//陣列從0開始，binarysearch找不到值會傳負值，所以find>-1回傳索引值find<=-1則找不到索引值
		int find = -1;
		//對已排序的陣列進行二元搜尋，如果找到指定的值就傳回該值所在的索引，否則就麼回負值 
		if ((find = Arrays.binarySearch(arr, key)) > -1) {
			System.out.println("找到值於索引 " + find + " 位置");
		} else
			System.out.println("找不到指定值");
		scanner.close();
	}

}

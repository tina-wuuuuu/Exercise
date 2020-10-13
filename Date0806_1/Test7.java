package Date0806_1;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr1.2.3空間都=10
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		//將arr1.2 空間內填滿5
		Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 5);
		//將arr3 空間填滿10
		Arrays.fill(arr3, 10);
		//當我們配置一個陣列之後，其會依資料型態來給定預設值，例如整數陣列就初始為 0，
		//可以使用Arrays.fill()方法來將所有的元素設定為指定的值
		System.out.print("arr1: ");
		//列印出arr1
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		//將arr1跟arr2.3比較是否相等
		System.out.println("\narr1 = arr2 ? " + Arrays.equals(arr1, arr2));
		System.out.println("arr1 = arr3 ? " + Arrays.equals(arr1, arr3));
		//Arrays.equals(,)比較兩個陣列中的元素值是否全部相等，如果是將傳回true，否則傳回 false 
	}

}

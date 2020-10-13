package Date0805_2;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 90, 85, 55, 94, 77 };
		// 利用for迴圈列印陣列值
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		System.out.println();
		// 為arr配置10個整數的陣列元素，索引為0到9，初始值預設為0
		int arr[] = new int[10];
		System.out.print("Array值: ");
		// 列印陣列
		for (int i = 0; i < arr.length; i++) {
			// 顯示皆為0
			System.out.print(arr[i] + " ");
			// arr[10]=0~9陣列
			arr[i] = i;
		}
		System.out.print("\n\nArray值: ");
		// 列印陣列
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

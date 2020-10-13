package Date0805_2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入Array大小: ");
		// 取得輸入大小
		int length = scanner.nextInt();
		// 將輸入值配置給arr
		int[] arr = new int[length]; // 動態配置長度
		// 列印輸入值
		System.out.println("Array長度: " + arr.length);
		System.out.print("內容: ");
		// 列印陣列
		for (int i = 0; i < arr.length; i++)
			// 陣列預設值會是0
			System.out.print(arr[i] + " ");
		System.out.println();
		scanner.close();
	}

}

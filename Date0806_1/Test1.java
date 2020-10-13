package Date0806_1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 宣告arr為二維陣列(兩列三行)
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 列印陣列
		// 陣列名稱直接加上length，所指的是有幾列（Row），
		// 而使用索引加上length，指的是該列所擁有的元素，也就是行（Column）數目，
		// arr.length長度=2 arr[0] arr[1]
		for (int i = 0; i < arr.length; i++) {
			// arr[0].length長度=3 arr[0][0] arr[0][1] arr[0][2]
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println();

		// 宣告arr1=三維陣列 int [][][]arr1= new int [2][2][3]
		// 三維陣列是2x2x3，想為兩面2x3二維陣列交疊在一起
		int[][][] arr1 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
		// arr長度=2
		for (int i = 0; i < arr1.length; i++) {
			// arr[0]長度=3
			for (int j = 0; j < arr1[0].length; j++) {
				//三維arr[i][j]長度
				for (int k = 0; k < arr1[i][j].length; k++) {
					System.out.print(arr1[i][j][k] + " ");
			}
			System.out.println();
		}
	}
}
}
		

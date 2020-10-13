package Date0805_2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		//當輸入-1時筆數也會被算入，所以初始值要是-1不能是0
		int count = -1;
		//當分數等於-1時停止迴圈，不等於-1繼續跑
		while (score != -1) {
			count++;
			sum += score;
			System.out.print("輸入分數(-1結束)：");
			//取得分數資料
			score = scanner.nextInt();
		}

		System.out.println("平均：" + (double) sum / count);
		scanner.close();
	}

}

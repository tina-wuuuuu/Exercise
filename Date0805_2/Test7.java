package Date0805_2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int replay = 0;
		//先斬後奏
		do {
			System.out.print("輸入整數值：");
			//取得輸入整數值
			input = scanner.nextInt();
			//輸入的值%2=1顯示Y，不等於顯示N
			System.out.println("輸入數為奇數？" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("繼續(1:繼續 0:結束)？");
			//取得輸入值
			replay = scanner.nextInt();
			//輸入值=1繼續迴圈，不等於1結束迴圈
		} while (replay == 1);
		scanner.close();
	}

}

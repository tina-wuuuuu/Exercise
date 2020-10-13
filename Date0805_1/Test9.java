package Date0805_1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 比較的條件成立時以true表示，比較的條件不成立時 以false表示，
		System.out.println("10 > 5 -> " + (10 > 5));
		System.out.println("10 >= 5 -> " + (10 >= 5));
		System.out.println("10 < 5 -> " + (10 < 5));
		System.out.println("10 <= 5 -> " + (10 <= 5));
		System.out.println("10 == 5 -> " + (10 == 5));
		System.out.println("10 != 5 -> " + (10 != 5)+"\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入學生分數: ");
		int scoreOfStudent = scanner.nextInt();
		// 「條件運算子」 （Conditional operator）：
		// 條件式 ? 成立傳回值 : 失敗傳回值
		// 條件運算子的傳回值依條件式的結果而定，
		// 如果條件式的結果為true，則傳回冒號前的值，若為false，則傳回冒號後的值，
		System.out.println("該生是否及格? " + (scoreOfStudent >= 60 ? '是' : '否'));

		System.out.print("請輸入數字: ");
		int inputedNumber = scanner.nextInt();
		//當輸入的數為奇數時，就不能被2整除，所以餘數一定不是0，
		//在條件式中判斷為true，因而傳回字元 '是' ，若數值為偶數，則2整除，
		//所以餘數為0，在條件式中判斷為false，所以傳回字元 '否'。
		System.out.println("是否為奇數? " + (inputedNumber % 2 != 0 ? '是' : '否'));
		scanner.close();
	}

}

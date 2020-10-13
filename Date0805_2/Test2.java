package Date0805_2;

import java.util.Scanner;

public class Test2 {
//上一個範例(Test1)的成績等級比對如何使用switch來改寫
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入分數: ");
		int score = scanner.nextInt();
		//level=輸入的分數/10
		int level = (int) score / 10;
		//在一開頭switch的括號中取出變數的值，然後逐一比對下面的case
		//遇到複合條件時，switch就幫不上忙了，
		//無法在switch中組合複雜的條件陳述，就得使用if了
		switch (level) {
		case 10:
		case 9:
			System.out.println("得A");
			//遇到break離開switch區塊
			break;
		case 8:
			System.out.println("得B");
			break;
		case 7:
			System.out.println("得C");
			break;
		case 6:
			System.out.println("得D");
			break;
		//如果沒有符合的數值或字元，則會執行default後的陳述句
		default:
			System.out.println("得E(不及格)");
		}
		scanner.close();
	}

}

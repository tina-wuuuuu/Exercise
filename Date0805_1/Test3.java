package Date0805_1;

//使用"import"是在告訴編譯器，您將使用java.util下的 Scanner類別。
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new表示新增一個物件，新增Scanner物件時需要System.in物件，scn存放
		Scanner scn = new Scanner(System.in);
		// 列印字串
		System.out.print("Please input your name: ");
		// 使用next取得scn存放的Scanner輸入資料
		System.out.printf("Hello! %s!\n", scn.next());
		// 養成關閉的好習慣

		// 取得輸入數字範例
		System.out.print("Please input a number: ");
		System.out.printf("Oh! I get %d!!", scn.nextInt());
		scn.close();

		// 要注意的是，Scanner取得輸入的依據是空白字元，
		// 舉凡按下空白鍵、tab鍵或是enter鍵，Scanner就會傳回下一個輸入，
		// 如果您想要取得包括空白字元的輸入，比較簡單的方法是使用 BufferedReader 類別取得輸入。
	}

}

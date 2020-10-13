package Date0806_2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[abc] a、b或c
		//[^abc] 非a、b、c的其它字元
		//[a-zA-Z] a到z或A到Z（範圍）
		//[a-d[m-p]] a到d或m到p（聯集）
		//[a-z&&[def]] d、e或f（交集）
		//[a-z&&[^bc]] a到z，除了b與c之外（減集）
		//[a-z&&[^mp]]
		//a到z且沒有m到p（a-lq-z）（減集） 
		//X? X出現一次或完全沒有 
		//X* X出現零次或多次
		//X+ X出現一次或多次
		//X{n} X出現n次
		//X{n,} X出現至少n次
		//X{n,m}出現至少n次，但不超過m次 
		
		
		Scanner scanner = new Scanner(System.in);

		String str = "abcdefgabcabc";
		// ；replaceAll()方法可以將符合正規表示式的子字串置換為指定的字串
		System.out.println(str.replaceAll(".bc", "###"));

		System.out.print("輸入手機號碼: ");
		//取得輸入號碼
		str = scanner.next();

		// 簡單格式驗證
		if (str.matches("[0-9]{4}-[0-9]{6}"))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");

		System.out.print("輸入href標籤: ");
		// Scanner的next()方法是以空白為區隔
		// 我們的輸入有空白，所以要執行兩次
		str = scanner.next() + " " + scanner.next();

		// 驗證href標籤
		if (str.matches("<a.+href*=*['\"]?.*?['\"]?.*?>"))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");

		System.out.print("輸入電子郵件: ");
		str = scanner.next();

		// 驗證電子郵件格式
		if (str.matches("^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$"))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");
		scanner.close();
	}

}

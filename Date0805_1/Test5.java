package Date0805_1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 指定字元編碼來輸出"Hello"這段文字
		System.out.println("\u0048\u0065\u006C\u006C\u006F"+"\n");

		int x = 19;
		// 轉成二進位 10011
		System.out.println(Integer.toBinaryString(x));
		// 轉成十六進位 13
		System.out.println(Integer.toHexString(x));
		// 轉成八進位 23
		System.out.println(Integer.toOctalString(x)+"\n");

		// 輸出 19 的十進位表示
		System.out.printf("%d%n", 19);
		// 輸出 19 的八進位表示
		System.out.printf("%o%n", 19);
		// 輸出 19 的十六進位表示
		System.out.printf("%x%n"+"\n", 19);

		// 輸出浮點數時指定精度
		System.out.printf("example:%.2f%n", 19.234);
		// 指定輸出時，至少要預留的字元寬度
		System.out.printf("example:%6.2f%n", 19.234);

	}

}

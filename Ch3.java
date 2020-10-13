package Date0715;

public class Ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 請設計可以輸出下列資料 程式實例 ex3_1.java
		 */
		System.out.println("ex3_1.java");
		// 修改ch3_6時薪改為150，每月花費改為1_0000，計算一年可以存多少錢
		final int hourly_salary, monthly_fee, year_savings;
		hourly_salary = 150;
		monthly_fee = 10000;
		year_savings = hourly_salary * 8 * 300 - monthly_fee * 12;
		System.out.println("一年可以存" + year_savings + "元");
		// ----
		System.out.println();
		// 設定矩形長寬，算出面積和周長。
		double length, width, area, permeter;
		length = 10.5;
		width = 5.6;
		permeter = length * 2 + width * 2;
		area = length * width;
		System.out.println("矩形周長為:" + permeter);
		System.out.println("矩形面積為:" + area);
		// ----------
		System.out.println();
		// -----------
		// 請列出Unicode碼65至90間的字元
		char ch = 65;
		for (ch = 65; ch <= 90; ch++) {
			System.out.print(ch);
		}
		// ----------
		System.out.println();
		// ----------
		// 請宣告具名常數PI=3.14159，當r=10和20時，求圓面積和周長。
		double PI = 3.14159;
		double r, circle_area, circle_permeter;
		r = 10;
		circle_area = PI * r * r;
		circle_permeter = 2 * PI * r;
		System.out.println("當半徑=" + r + "圓面積為" + circle_area + "\r\n" + "當半徑=" + r + "圓周長為" + circle_permeter);
		r = 20.5;
		circle_area = PI * r * r;
		circle_permeter = 2 * PI * r;
		System.out.println("當半徑=" + r + "圓面積為" + circle_area + "\r\n" + "當半徑=" + r + "圓周長為" + circle_permeter);
		// ----------
		// 宣告常數IN等於1.05%，IN是銀行年利率，計算當存款金額為50W.100W時，半年後本金加利息=?
		double IN = 0.00105, sa, sb;
		int saving_a = 500000, saving_b = 1000000;
		sa = (saving_a * IN) / 2 + saving_a;
		sb = (saving_b * IN) / 2 + saving_b;
		System.out.println("五十萬半年加本金為:" + sa);
		System.out.println("五十萬半年加本金為:" + sb);
		// ---------
		System.out.println();
		// 列出2進位.8進位.16進位的值(100.55.299.399.86)
		// %d十進位輸出，%o八進位，%h十六進位，%n換行，%b輸出布林值，%s字串
		int a = 100, b = 55, c = 299, d = 399, e = 86;
		// ------
		Integer.toBinaryString(a);
		Integer.toBinaryString(b);
		Integer.toBinaryString(c);
		Integer.toBinaryString(d);
		Integer.toBinaryString(e);
		// ------二進位
		System.out.println("十進位轉二進位" + Integer.toBinaryString(a));
		System.out.println("十進位轉二進位" + Integer.toBinaryString(b));
		System.out.println("十進位轉二進位" + Integer.toBinaryString(c));
		System.out.println("十進位轉二進位" + Integer.toBinaryString(d));
		System.out.println("十進位轉二進位" + Integer.toBinaryString(e));
		// ----
		System.out.println();
		// ------
		System.out.printf(a + "以八進位表示:%o%n", a);
		System.out.printf(b + "以八進位表示:%o%n", b);
		System.out.printf(c + "以八進位表示:%o%n", c);
		System.out.printf(d + "以八進位表示:%o%n", d);
		System.out.printf(e + "以八進位表示:%o%n", e);
		System.out.println();
		System.out.printf(a + "以十六進位表示:%h%n", a);
		System.out.printf(b + "以十六進位表示:%h%n", b);
		System.out.printf(c + "以十六進位表示:%h%n", c);
		System.out.printf(d + "以十六進位表示:%h%n", d);
		System.out.printf(e + "以十六進位表示:%h%n", e);
		// -------------
		System.out.println();
		// 將下列值轉為10進位
		int x, y, z;
		x = 0b11110010;
		System.out.println("列印0b11110010的值:" + x);
		y = 076543;
		System.out.println("列印076543的值:" + y);
		z = 0xaaabbb;
		System.out.println("列印0zaaabbb的值:" + z);

	}

}

package String;

import java.util.Date;
import java.util.Locale;

public class Format {
	// 格式化字串
	// 方法宣告 String format(String format,Object...args);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.format("%d", 400 / 2);
		String str2 = String.format("%b", 3 > 5);
		System.out.println("格式化為十進位整數"+str1);
		System.out.println("格式化為布林值型態"+str2);
		String str3 = String.format("%e", 15.000);
		String str4 = String.format("%x", 15);
		System.out.println("格式化為電腦科學記號數法表示的十進位數字"+str3);
		System.out.println("格式化為十六進位整數"+str4);
		String str5 = String.format("%h", 15);
		System.out.println("格式化為雜湊碼"+str5);
		String str6 = String.format("%s", "abc");
		String str7 = String.format("%c", 'c');
		String str8 = String.format("%o", 20);
		System.out.println("格式化為字串型態"+str6);
		System.out.println("格式化為字元型態"+str7);
		System.out.println("格式化為八進位整數"+str8);
		String str9 = String.format("%a", 10.98);
		String str10 = String.format("%n",str7);
		String str11 = String.format("%%", 10);
		System.out.println("格式化為帶有效為數和指數的十六進位浮點值"+str9);
		System.out.println("格式化為特定平台的行分隔符號"+str10);
		System.out.println("格式化為字面值%"+str11);
		//透過指定的特殊轉換符號作為參數，來實現對日期和時間字串的格式化
		//方法宣告 String format(Locale 1,String format,Object...args);
		//將目前日期以4位年份、月份全稱、兩位日期形式輸出。
		Date date = new Date();
		Locale form = Locale.TAIWAN;
		String year = String.format(form, "%tY", date);
		String month = String.format(form, "%tB", date);
		String day = String.format(form, "%td", date);
		//大小寫比較
		String Day = String.format(form, "%tD", date);
		System.out.println("今年是："+year);
		System.out.println("現在是："+month);
		System.out.println("今天是:"+day);
		//額外比較
		System.out.println(Day);
		//將目前日期以2位年份、月份簡稱、全部日期形式輸出
		String year_ex2 = String.format("%ty", date);//2位年份
		String month_ex2 = String.format("%tm", date);//月份簡稱
		String day_ex2 = String.format("%tc", date);//全部日期和時間格式
		System.out.println("今年是："+year_ex2+"年");
		System.out.println("現在是："+month_ex2);
		System.out.println("今天是:"+day_ex2);
	}

}

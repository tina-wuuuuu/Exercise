package Date0708;

import java.util.Scanner;

public class Ex6 {
//輸入西元年份，判斷是否為閏年(閏年能被400整除；能被4整除，不能被100整除)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入西元年份");
		year=scn.nextInt();
		if (year%400==0 || year%4==0) {
			System.out.println(year+"是閏年");
		}else if(year/100!=0) {
			System.out.println(year+"不是閏年");
		}
		scn.close();
	}

}

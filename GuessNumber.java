package Date0814;

import java.time.Duration;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startdate, enddate;
		int pwd=(int)(Math.random()*(99-0+1)+0);
		int num;
		Scanner scn = new Scanner(System.in);
		startdate = System.currentTimeMillis();
		for( ; ; ) {
			System.out.println("請輸入數字：");
			num = scn.nextInt();
			if(num==pwd) {
				System.out.println("恭喜你，猜對了！");
				enddate=System.currentTimeMillis();
				break;
			}else if(num>pwd) {
				System.out.println("猜小一點");
			}else if(num<pwd) {
				System.out.println("猜大一點");
			}
			System.out.println("猜錯了，再猜一次！");
		}
		System.out.printf("你總共花了%d毫秒",(enddate-startdate));
	}

}

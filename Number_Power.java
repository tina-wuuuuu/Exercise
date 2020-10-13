package Date0723;

import java.util.Scanner;

public class Ex10 {
//請幫公司設計一個方法，計算某數值的幾次方
	public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
System.out.println("請輸入數值");
Scanner scn1 = new Scanner(System.in);
int n=scn1.nextInt();
int x=fib(n);
System.out.println("請輸入次方");
int m=scn.nextInt();
int y=(int) Math.pow(x,m);
System.out.println(y);
	scn.close();}

	public static int fib(int n) {
		if (n==0) 
			return 1;
		else
			return n;
	}
}

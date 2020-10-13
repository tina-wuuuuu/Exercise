package Date0708;

import java.util.Scanner;

public class Ex1 {
//判斷奇偶數
	public static void main(String[] args) {
		int number;
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入值");
		number=scn.nextInt();
		if (number % 2==0) {
			System.out.println("該值為偶數");
		}else {
			System.out.println("該值為奇數");
		}
		scn.close();
		
	}

}

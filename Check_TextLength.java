package Date0729;

import java.util.Scanner;

import Date0729.Check;

public class Test4 {
//使用者輸入一個五個長度的字串，請檢驗長度是否為五，第二個字是否為英文字，
	//上述透過"建構元"完成
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入長度五個字的英文數字");
		String a = scn.next();
		Check ch = new Check();
		ch.length(a);
		ch.num2(a);
		scn.close();
	}
}
class Check {
	void length(String a1) {
		if (a1.length() == 5) {
			System.out.println("長度正確");
		} else
			System.out.println("長度有誤");
	}
	void num2(String a2) {
				System.out.println("第二個字為" + a2.charAt(1));
				int aa=a2.charAt(1);
			if (aa >= 65 && aa <= 122) {
				System.out.println("第二個字是英文字");
			}else 	System.out.println("第二個字不是英文字");
		}
	}
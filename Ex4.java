package Date0708;

import java.util.Scanner;

public class Ex4 {
//判斷帳號密碼是否正確
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password,uname,pword;
		username="tina";
		password="apple";
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入帳號");
		uname=scn.next();
		System.out.println("請輸入密碼");
		pword=scn.next();
		if (uname.equals(username)) {
			System.out.println("帳號輸入正確");
		}else {
			System.out.println("帳號有誤");
			}
		if (pword.equals(password)) {
			System.out.println("密碼輸入正確");
		}else {
			System.out.println("密碼有誤");
		}
		if (uname.equals(username)|| pword.equals(password)) {
			System.out.println("登入成功");
		}
		else  {
			System.out.println("登入失敗");
		}
	scn.close();
	}
	

}

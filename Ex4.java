package Date0708;

import java.util.Scanner;

public class Ex4 {
//�P�_�b���K�X�O�_���T
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password,uname,pword;
		username="tina";
		password="apple";
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�b��");
		uname=scn.next();
		System.out.println("�п�J�K�X");
		pword=scn.next();
		if (uname.equals(username)) {
			System.out.println("�b����J���T");
		}else {
			System.out.println("�b�����~");
			}
		if (pword.equals(password)) {
			System.out.println("�K�X��J���T");
		}else {
			System.out.println("�K�X���~");
		}
		if (uname.equals(username)|| pword.equals(password)) {
			System.out.println("�n�J���\");
		}
		else  {
			System.out.println("�n�J����");
		}
	scn.close();
	}
	

}

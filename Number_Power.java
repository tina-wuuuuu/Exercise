package Date0723;

import java.util.Scanner;

public class Ex10 {
//�������q�]�p�@�Ӥ�k�A�p��Y�ƭȪ��X����
	public static void main(String[] args) {
Scanner scn =new Scanner(System.in);
System.out.println("�п�J�ƭ�");
Scanner scn1 = new Scanner(System.in);
int n=scn1.nextInt();
int x=fib(n);
System.out.println("�п�J����");
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

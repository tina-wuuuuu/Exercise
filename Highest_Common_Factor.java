package Date0723;

import java.util.Scanner;

public class Ex9 {
//��J��ơA�D�̤j���]��(���j)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���");
		System.out.print("m=");
		int m = scn.nextInt();
		System.out.print("n=");
		int n = scn.nextInt();
		System.out.println("�̤j���]��=" + num(m, n));
		scn.close();
	}

	public static int num(int m, int n) {
		if (n == 0)
			return m;
		else
			return num(n, m % n);
	}
}

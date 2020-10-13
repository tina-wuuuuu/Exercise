package Date0723;

import java.util.Scanner;

public class Ex9 {
//块ㄢ计―程そ计(患癹)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块ㄢ计");
		System.out.print("m=");
		int m = scn.nextInt();
		System.out.print("n=");
		int n = scn.nextInt();
		System.out.println("程そ计=" + num(m, n));
		scn.close();
	}

	public static int num(int m, int n) {
		if (n == 0)
			return m;
		else
			return num(n, m % n);
	}
}

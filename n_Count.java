package Date0723;

import java.util.Scanner;

public class Ex8 {
//­pºân!¡A1*2*3*4*..*n
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn­È=");
		int W=scn.nextInt();
System.out.println("1*2*...*n="+fac(W));
	scn.close();}
public static int fac(int n) {
	if(n==0)
		return 1;
	else
	return n*fac(n-1);
}
}

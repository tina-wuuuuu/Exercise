package Date0709;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// ���1~100�����(��J�Ʀr�P�_�O���O���)
		boolean prime=true;
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��ư���ƴ���:");
		num=scn.nextInt();
		if (num==1) {
			System.out.printf("%d�O���",num);
		}
		if (num==2) {
			System.out.printf("%d�O���",num);
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					System.out.printf("%d���O���", num);
					prime=false;
					break;
				}
			}
			if (prime) {
				System.out.printf("%d�O���",num);
			}
		}
		scn.close();
	}

}

package Date0709;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 顯示1~100的質數(輸入數字判斷是不是質數)
		boolean prime=true;
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數做質數測試:");
		num=scn.nextInt();
		if (num==1) {
			System.out.printf("%d是質數",num);
		}
		if (num==2) {
			System.out.printf("%d是質數",num);
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					System.out.printf("%d不是質數", num);
					prime=false;
					break;
				}
			}
			if (prime) {
				System.out.printf("%d是質數",num);
			}
		}
		scn.close();
	}

}

package Date0814;

import java.time.Duration;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startdate, enddate;
		int pwd=(int)(Math.random()*(99-0+1)+0);
		int num;
		Scanner scn = new Scanner(System.in);
		startdate = System.currentTimeMillis();
		for( ; ; ) {
			System.out.println("�п�J�Ʀr�G");
			num = scn.nextInt();
			if(num==pwd) {
				System.out.println("���ߧA�A�q��F�I");
				enddate=System.currentTimeMillis();
				break;
			}else if(num>pwd) {
				System.out.println("�q�p�@�I");
			}else if(num<pwd) {
				System.out.println("�q�j�@�I");
			}
			System.out.println("�q���F�A�A�q�@���I");
		}
		System.out.printf("�A�`�@��F%d�@��",(enddate-startdate));
	}

}

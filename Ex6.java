package Date0708;

import java.util.Scanner;

public class Ex6 {
//��J�褸�~���A�P�_�O�_���|�~(�|�~��Q400�㰣�F��Q4�㰣�A����Q100�㰣)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�褸�~��");
		year=scn.nextInt();
		if (year%400==0 || year%4==0) {
			System.out.println(year+"�O�|�~");
		}else if(year/100!=0) {
			System.out.println(year+"���O�|�~");
		}
		scn.close();
	}

}

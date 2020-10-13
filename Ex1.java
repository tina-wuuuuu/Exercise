package Date0716;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入分數=");
		int score = scn.nextInt();
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A grade");
			break;
		case 8:
			System.out.println("B grade");
			break;
		case 7:
			System.out.println("C grade");
			break;
		case 6:
			System.out.println("D grade");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F grade");
			break;
		default:
			System.out.println("error");
			break;

		}
		scn.close();
	}

}

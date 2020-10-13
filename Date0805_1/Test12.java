package Date0805_1;

import java.util.Scanner;

public class Test12 {
	//耞ㄏノ块琌计临琌案计
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("叫块计: ");
		int input = scanner.nextInt();
		//remain=块计%2
		int remain = input % 2;
		//remain緇计=1ボ计
		if (remain == 1)
			System.out.println(input + "计");
		else//ぃ单1ボ案计
			System.out.println(input + "案计");
		scanner.close();
	}

}

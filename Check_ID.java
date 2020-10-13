package Date0716;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 驗證身份證字號正確性，推論身分證字號
		char ch;
		int n = 0;
		String id;
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身份證字號");
		id = scn.next();
		if (id.length() != 10) {
			System.out.println("ID錯誤");
			System.exit(0);
			// 檢查身分證長度
		}
		ch = id.charAt(1);
		if (ch < '1' || ch > '2') {
			System.out.println("ID錯誤");
			System.exit(0);
		}
		// 檢查性別
		/*
		 * Character類別方法isDigit()
		 */
		for (int i = 2; i < 10; i++) {
			boolean cd = Character.isDigit(id.charAt(i));
			if (!cd) {
				System.out.println("ID錯誤");
				System.exit(0);
			}
		}
		// 檢查第二碼以後類別是不是數字
		id = id.toUpperCase();
		// 將字串轉換大寫
		ch = id.charAt(0);
		// 取第一碼英文
		switch (ch) {
		case 'A':
			n = 10;
			break;
		case 'B':
			n = 11;
			break;
		case 'C':
			n = 12;
			break;
		case 'D':
			n = 13;
			break;
		case 'E':
			n = 14;
			break;
		case 'F':
			n = 15;
			break;
		case 'G':
			n = 16;
			break;
		case 'H':
			n = 17;
			break;
		case 'I':
			n = 34;
			break;
		case 'J':
			n = 18;
			break;
		case 'K':
			n = 19;
			break;
		case 'L':
			n = 20;
			break;
		case 'M':
			n = 21;
			break;
		case 'N':
			n = 22;
			break;
		case 'O':
			n = 35;
			break;
		case 'P':
			n = 23;
			break;
		case 'Q':
			n = 24;
			break;
		case 'R':
			n = 25;
			break;
		case 'S':
			n = 26;
			break;
		case 'T':
			n = 27;
			break;
		case 'U':
			n = 28;
			break;
		case 'V':
			n = 29;
			break;
		case 'W':
			n = 32;
			break;
		case 'X':
			n = 30;
			break;
		case 'Y':
			n = 31;
			break;
		case 'Z':
			n = 33;
			break;
		default:
			System.out.println("ID錯誤");
			System.exit(0);
		} // 英文轉代碼數字
		int s0;
		s0 = (n / 10) + (n % 10 * 9);
		// 步驟二:將轉換後的二位數，其個位數字乘以 9 倍、再加上十位數字
		String s;
		s = id.substring(1, 2);
		int s1 = Integer.parseInt(s);
		s = id.substring(2, 3);
		int s2 = Integer.parseInt(s);
		s = id.substring(3, 4);
		int s3 = Integer.parseInt(s);
		s = id.substring(4, 5);
		int s4 = Integer.parseInt(s);
		s = id.substring(5, 6);
		int s5 = Integer.parseInt(s);
		s = id.substring(6, 7);
		int s6 = Integer.parseInt(s);
		s = id.substring(7, 8);
		int s7 = Integer.parseInt(s);
		s = id.substring(8, 9);
		int s8 = Integer.parseInt(s);
		s = id.substring(9, 10);
		int s9 = Integer.parseInt(s);

		int total;
		total = s0 + s1 * 8 + s2 * 7 + s3 * 6 + s4 * 5 + s5 * 4 + s6 * 3 + s7 * 2 + s8 * 1;
		// 步驟三:將身分證數字前八碼從左到右依次乘上 8、7、6、5、4、3、2、1
		// 步驟四:將步驟二與步驟三結果加總
		int check;
		check = 10 - total % 10;
		// 步驟五：所得總和除以 10 得到的餘數，再用 10 減去此餘數，結果就是檢查碼；若餘數為 0，檢查碼就是 0

		if (check == s9) {
			System.out.println("ID正確");
		} else {
			System.out.println("ID有誤");
		}scn.close();

	}

}

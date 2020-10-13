package Date0716;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//若有一張健保卡的身分證字號為 F▊25791484，推論主人為男性還是女性
		String id = "F025791484";
		// 先設遺失的第一碼數字為0，之後用w推算真實遺失的值
		id = id.toUpperCase();
		// 將第一個英文字轉為大寫
		char ch;
		ch = id.charAt(0);
		// 取ID字串第一碼
		int n = 0;
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
		}
		// 將第一碼英文轉代碼數字
		int s0;
		s0 = n / 10 + (n % 10) * 9;
		// 計算代碼運算步驟二的結果
		// System.out.print(s0);
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
		// 取字串轉為數值
		// System.out.print(s9);
		int w = 0;
		int ss1;
		int check;
		for (w = 0; w <= 9; w++) {
			// 用w=0~9反推運算
			// System.out.print(w);
			ss1 = s1 + w;
			int total;
			total = s0 + ss1 * 8 + s2 * 7 + s3 * 6 + s4 * 5 + s5 * 4 + s6 * 3 + s7 * 2 + s8 * 1;
			check = 10 - total % 10;
			// 計算加總
			if (check == s9) {
				// 運算加總等於檢查碼的話等於符合正確身分證字號，
				// 由此可知真實值為w
				System.out.println("遺失的值有可能是:" + w);
				if (w == 1) {
					System.out.println("主人為男性");
				}
				if (w == 2) {
					System.out.println("主人為女性");
				} else {
					System.out.println("該值無效");
				}
			}

		}

	}

}

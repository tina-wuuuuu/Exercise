package Date0716;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ҩ����Ҧr�����T�ʡA���ר����Ҧr��
		char ch;
		int n = 0;
		String id;
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�����Ҧr��");
		id = scn.next();
		if (id.length() != 10) {
			System.out.println("ID���~");
			System.exit(0);
			// �ˬd�����Ҫ���
		}
		ch = id.charAt(1);
		if (ch < '1' || ch > '2') {
			System.out.println("ID���~");
			System.exit(0);
		}
		// �ˬd�ʧO
		/*
		 * Character���O��kisDigit()
		 */
		for (int i = 2; i < 10; i++) {
			boolean cd = Character.isDigit(id.charAt(i));
			if (!cd) {
				System.out.println("ID���~");
				System.exit(0);
			}
		}
		// �ˬd�ĤG�X�H�����O�O���O�Ʀr
		id = id.toUpperCase();
		// �N�r���ഫ�j�g
		ch = id.charAt(0);
		// ���Ĥ@�X�^��
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
			System.out.println("ID���~");
			System.exit(0);
		} // �^����N�X�Ʀr
		int s0;
		s0 = (n / 10) + (n % 10 * 9);
		// �B�J�G:�N�ഫ�᪺�G��ơA��Ӧ�Ʀr���H 9 ���B�A�[�W�Q��Ʀr
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
		// �B�J�T:�N�����ҼƦr�e�K�X�q����k�̦����W 8�B7�B6�B5�B4�B3�B2�B1
		// �B�J�|:�N�B�J�G�P�B�J�T���G�[�`
		int check;
		check = 10 - total % 10;
		// �B�J���G�ұo�`�M���H 10 �o�쪺�l�ơA�A�� 10 ��h���l�ơA���G�N�O�ˬd�X�F�Y�l�Ƭ� 0�A�ˬd�X�N�O 0

		if (check == s9) {
			System.out.println("ID���T");
		} else {
			System.out.println("ID���~");
		}scn.close();

	}

}

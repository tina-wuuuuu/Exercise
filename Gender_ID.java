package Date0716;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�Y���@�i���O�d�������Ҧr���� F�o25791484�A���ץD�H���k���٬O�k��
		String id = "F025791484";
		// ���]�򥢪��Ĥ@�X�Ʀr��0�A�����w����u��򥢪���
		id = id.toUpperCase();
		// �N�Ĥ@�ӭ^��r�ର�j�g
		char ch;
		ch = id.charAt(0);
		// ��ID�r��Ĥ@�X
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
		// �N�Ĥ@�X�^����N�X�Ʀr
		int s0;
		s0 = n / 10 + (n % 10) * 9;
		// �p��N�X�B��B�J�G�����G
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
		// ���r���ର�ƭ�
		// System.out.print(s9);
		int w = 0;
		int ss1;
		int check;
		for (w = 0; w <= 9; w++) {
			// ��w=0~9�ϱ��B��
			// System.out.print(w);
			ss1 = s1 + w;
			int total;
			total = s0 + ss1 * 8 + s2 * 7 + s3 * 6 + s4 * 5 + s5 * 4 + s6 * 3 + s7 * 2 + s8 * 1;
			check = 10 - total % 10;
			// �p��[�`
			if (check == s9) {
				// �B��[�`�����ˬd�X���ܵ���ŦX���T�����Ҧr���A
				// �Ѧ��i���u��Ȭ�w
				System.out.println("�򥢪��Ȧ��i��O:" + w);
				if (w == 1) {
					System.out.println("�D�H���k��");
				}
				if (w == 2) {
					System.out.println("�D�H���k��");
				} else {
					System.out.println("�ӭȵL��");
				}
			}

		}

	}

}

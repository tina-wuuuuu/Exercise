package Date0729;

import java.util.Scanner;

import Date0729.Check;

public class Test4 {
//�ϥΪ̿�J�@�Ӥ��Ӫ��ת��r��A��������׬O�_�����A�ĤG�Ӧr�O�_���^��r�A
	//�W�z�z�L"�غc��"����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���פ��Ӧr���^��Ʀr");
		String a = scn.next();
		Check ch = new Check();
		ch.length(a);
		ch.num2(a);
		scn.close();
	}
}
class Check {
	void length(String a1) {
		if (a1.length() == 5) {
			System.out.println("���ץ��T");
		} else
			System.out.println("���צ��~");
	}
	void num2(String a2) {
				System.out.println("�ĤG�Ӧr��" + a2.charAt(1));
				int aa=a2.charAt(1);
			if (aa >= 65 && aa <= 122) {
				System.out.println("�ĤG�Ӧr�O�^��r");
			}else 	System.out.println("�ĤG�Ӧr���O�^��r");
		}
	}
package Date0805_1;

//�ϥ�"import"�O�b�i�D�sĶ���A�z�N�ϥ�java.util�U�� Scanner���O�C
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new��ܷs�W�@�Ӫ���A�s�WScanner����ɻݭnSystem.in����Ascn�s��
		Scanner scn = new Scanner(System.in);
		// �C�L�r��
		System.out.print("Please input your name: ");
		// �ϥ�next���oscn�s��Scanner��J���
		System.out.printf("Hello! %s!\n", scn.next());
		// �i���������n�ߺD

		// ���o��J�Ʀr�d��
		System.out.print("Please input a number: ");
		System.out.printf("Oh! I get %d!!", scn.nextInt());
		scn.close();

		// �n�`�N���O�AScanner���o��J���̾ڬO�ťզr���A
		// �|�Z���U�ť���Btab��άOenter��AScanner�N�|�Ǧ^�U�@�ӿ�J�A
		// �p�G�z�Q�n���o�]�A�ťզr������J�A���²�檺��k�O�ϥ� BufferedReader ���O���o��J�C
	}

}

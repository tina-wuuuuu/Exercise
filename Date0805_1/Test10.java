package Date0805_1;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �T�q�{�����O�|��Xtrue�Bfalse�Ptrue�T�ت��p�C
		int number = 75;
		System.out.println((number > 70 && number < 80));
		System.out.println((number > 80 || number < 75));
		System.out.println(!(number > 80 || number < 75)+"\n");

		// �ݡu�줸�B��l�v�]Bitwise operator�^�A�b �Ʀ�]�p�W��AND�BOR�BNOT�BXOR�P�ɼƵ��B��A
		// �bJava�����ѳo�ǹB�⪺�N�O�줸�B��l�A
		// ���̪��������O�O AND �]&�^�BOR�]|�^�BXOR�]^�^�P�ɼơ]~�^�C
		System.out.println("AND�B��G");
		System.out.println("0 AND 0\t\t" + (0 & 0));
		System.out.println("0 AND 1\t\t" + (0 & 1));
		System.out.println("1 AND 0\t\t" + (1 & 0));
		System.out.println("1 AND 1\t\t" + (1 & 1));
		System.out.println("\nOR�B��G");
		System.out.println("0 OR 0\t\t" + (0 | 0));
		System.out.println("0 OR 1\t\t" + (0 | 1));
		System.out.println("1 OR 0\t\t" + (1 | 0));
		System.out.println("1 OR 1\t\t" + (1 | 1));
		System.out.println("\nXOR�B��G");
		System.out.println("0 XOR 0\t\t" + (0 ^ 0));
		System.out.println("0 XOR 1\t\t" + (0 ^ 1));
		System.out.println("1 XOR 0\t\t" + (1 ^ 0));
		System.out.println("1 XOR 1\t\t" + (1 ^ 1)+"\n");

		// XOR���B������`���A�o���|��²�檺XOR�r���[�K�Ҥl�A���ݬݵ{���G
		char ch = 'A';
		System.out.println("before encoding�G" + ch);
		// ²��XOR�r���[�K���ʧ@
		ch = (char) (ch ^ 0x7);
		System.out.println("after encoding�G" + ch);
		// ²�檺XOR�r���[�K�A�n�ѱK�]�u�n�A�i��ۦP���줸����N�i�H�F�C
		ch = (char) (ch ^ 0x7);
		System.out.println("decoding�G" + ch+"\n");

		//�b�줸�B��W�AJava�٦������]<<�^�P�k���]>>�^��ӹB��l�A
		//�����B��l�|�N�Ҧ����줸���������w����ơA
		//����Q���X�h���줸�|�Q���A�ӥk��|�ɤW0�F
		
		//�k���B��h�O�ۤϡA�|�N�Ҧ����줸���k�����w����ơA
		//�k��Q���X�h���줸�|�Q���A�ܩ���줸��0�θ�1�h���̥����Ӫ��줸�өw�A
		//�p�G��ӬO0�N��0�A�O1�N��1�A�z�٥i�H�ϥ�>>>�B��l�A
		//�o�ӹB��l�b�k����@��b�̥���ɤW0�C
		number = 1;
		System.out.println("2��0��: " + number);
		number = number << 1;
		System.out.println("2��1��: " + number);
		number = number << 1;
		System.out.println("2��2��: " + number);
		number = number << 1;
		System.out.println("2��3���G" + number);

	}

}

package Date0805_1;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������[�� ����=7
		System.out.println(1 + 2 * 3);
		//��(int)3/4=0 1+2+0 ����=3
		System.out.println(1+2+3 / 4);
		//(int)6/4 ����=1
		System.out.println((1+2+3) / 4);
		//(double) 6/3 ����=1.5
		System.out.println((double)(1+2+3) / 4+"\n");
		//(int) 10/3 ����=3
		int testNumber = 10;
		System.out.println(testNumber / 3); 
		//�p�G�B�⦡�����@�ӯB�I�ơA�h�{���N�|���ഫ�ϥίB�I�ƨӹB��
		System.out.println(testNumber / 3.0);
		//�u���w���A�ഫ�v�A�ϥ�double�i�D�{�����NtestNumber�����ഫ��double�A
		//�M��A�i�氣�k�B��A�ҥH���G�|�O���T��3.3333
		System.out.println((double) testNumber / 3+"\n");
		
		//testInteger���൥��testDouble
		//�N��T�פj�����w����T�פp���ܼƮɡA�ѩ�b��T�פW�|���򥢪��{�H�A
		//�sĶ���|�{�w�o�O�@�ӿ��~
		//int testInteger = 0;
		//double testDouble = 3.14;
		//testInteger = testDouble;
		//System.out.println(testInteger); 
		//�p�G�z�T�w�o�O�z�n�����G�A�z�������T�[�W�ഫ�����w�r�GtestInteger = (int) testDouble;
		
		int count=0;
		//%�B��l�O�l���B��l�A���p�Ⱓ�k�᪺�l�ơA�@�ӨϥΪ��Ҥl�O�Ʀr�`���A
		//���]���@�ӥߤ���n�i��360�ױ���A�C���b���פW�[1�A
		//��360�׫ᥲ���_�k��0�A�M�᭫�s�p�ơA�o�ɱz�i�H�o�򼶼g�G 
		count = (count + 1) % 360;
		
		
	}

}

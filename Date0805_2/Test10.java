package Date0805_2;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 100;
		Integer i2 = 100;
//�H'=='�i�H�����Ӱ򥻫��A���ܼƭȬO�_�۵��A
//�]�i�H�P�_��Ӫ����ܼƪ��ѦҪ���O�_�ۦP
//�ȱq-128��127�������ȡA���̳Q�ˬ�Integer�����A�|�s�b�O���餧���Q����
//��Ȧb100�A�ϥ�'=='�i�����ɡAi1 �P i2��ڤW�ѦҦܦP�@�Ӫ���C
		if (i1 == i2)
			System.out.println("i1 == i2");
		else
			System.out.println("i1 != i2");
		i1 = 200;
		i2 = 200;
//�W�L�F�q-128��127�������ȡA�Q�˽c�᪺Integer����ä��|�Q���ΡA�Y�۷��C�����s�ؤ@��Integer����A
//�H��Ȧb 200�A�ϥ�'=='�i�����ɡAi1�Pi2�ѦҪ��O���P������C 
		if (i1 == i2)
			System.out.println("i1 == i2");
		else
			System.out.println("i1 != i2");

	}

}

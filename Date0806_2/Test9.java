package Date0806_2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder���O�A�ϥγo�����O�Ҳ��ͪ�����w�]�|��16�Ӧr�������סA�z�]�i�H�ۦ���w��l���סA
		//�p�G���[�ܪ��󪺦r���W�X�i�e�Ǫ����סA�hStringBuilder����|�۰ʼW�[���סC
		StringBuilder strBuilder = new StringBuilder("Knowledge is power!");
		System.out.println("���e: " + strBuilder);
		//length()�i�Ǧ^�ثe���󤤪��r�����סA
		System.out.println("����: " + strBuilder.length());
		//capacity()�i�Ǧ^�Ӫ���ثe�i�e�Ǫ��r���e�q
		System.out.println("�e�q: " + strBuilder.capacity());
	}

}

package Date0806_3;

public class Test1 {
//�ϥ�"class"����r�ӮѼg���O�]�W��ѡ^�A
//�ϥ����O�өw�q�@�Ӫ���]object�^�ɡA
//�Ҽ{����i��֦����u�ݩʡv�]Property�A�bJava���h�O��Field�^�P�u��k�v�]Method�^�C
//�ݩʬO�ѻP���󤺳��B�⪺��Ʀ����A�Ӥ�k�h�O����P�~�ɤ��ʪ��ʺA�ާ@�C 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball(18.4, "red ball");
		 System.out.println("�W��: " + b1.getName());
		 System.out.println("�b�|: " + b1.getRadius()); 

	}
	//"class"�OJava���Ψөw�q���O������r�ABall�O�z�Ҩ������O�W��
	public static class Ball {
		//��radius�Bname�����O�B��ѻP��ơ]Field�^����
		private double radius; // �b�|
		private String name; // �W��

		// �L�Ѽƫغc��k
		public Ball() {
			this(0.0, "no name");
		}
		//�b���O�����B��ѻP��ơ]Field�^�Τ��ʤ�k�]Method�^�A
		//�ڭ̲κ٨䬰 ���O�����]Class member�^�C
		//-----
		//���O�W�٦P�W����k�٤��� �غc��k Cconstructor�^�A�]���H�٤����u�غc�l�v�A
		//���S���Ǧ^�ȡC�U�W��q�A
		//�غc�����@�άO���z�غc����i�H�]�w�@�ǥ��n���غc��T�A
		//���i�H�Q�����]Overload�^�A�H��������ͦ��ɤ��P���]�w����C
		public Ball(double radius, String name) {
			this.radius = radius;
			this.name = name;
		}
		//getRadius()�PgetName()�O���ʤ�k�]Method�^����
		//public���}���� private�p������
		public double getRadius() {
			return radius;
		}
		//getRadius()�PgetName()�O���ʤ�k�]Method�^����
		public String getName() {
			return name;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}

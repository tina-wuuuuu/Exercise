package Package;

public class ParseInt {
	//�N�r��ѪR��int��
	//int parseInt(String s) throws NumverFormatException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stri = "123456";
		int str = Integer.parseInt(stri);
		System.out.println("str�r����int�ȡG"+str);
		String str0[] = {"15","20","25","30"};
		int sum = 0;
		for (int i=0;i<str0.length;i++) {
			int myint = Integer.parseInt(str0[i]);
			sum = sum+=myint;
		}
		System.out.println("str0 �}�C���U�������M���G"+sum);
	}

}

package String;

public class ValueOf {
	//�򩳸�ƫ��O�ഫ���r��
	// String valueOf(boolean/char/int/long/float/double b)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean strCom = true;
		String str = String.valueOf(strCom);
		System.out.println(str);
		
		char strCom1 = 'A';
		String str1 = String.valueOf(strCom1);
		System.out.println(str1);
		
		int strCom2 = 2020;
		String str2 = String.valueOf(strCom2);
		System.out.println(str2);
		
		long strCom3 = 289L;
		String str3 = String.valueOf(strCom3);
		System.out.println(str3);
		
		float strCom4 = 0.24f;
		String str4 = String.valueOf(strCom4);
		System.out.println(str4);
		
		double strCom5 = 58.893;
		String str5 = String.valueOf(strCom5);
		System.out.println(str5);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//String valueOf(char[] data)
		char [] array = {'��','�c','�]','��'};
		String data = String.valueOf(array);
		System.out.println(data);
		//String valueOf(char[] data,int offset,int count);
		//offset:��l�����q
		//count:����
		String data2 = String.copyValueOf(array, 2, 2);
		System.out.println(data2);
		//String valueOf(Object obj);
		//obj:�@�Ӫ���
		Integer o = new Integer(123);
		String data3 = String.valueOf(o);
		System.out.println(data3);
		
		
	}	

}

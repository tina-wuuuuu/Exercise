package Package;

public class GetInteger {
	// ��o��ƪ��t���ݩʭ�
	// Integer getInteger(String nm);
	// nm:�ݩʦW
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nm = "sun.arch.data.model";
		Integer i = Integer.getInteger(nm,10);
		System.out.println(i);

		System.out.println();

		// Integer getInteger(String nm,int val);
		// val:int���w�]�ȡA���=null�N�Ǧ^�w�]��
		String nm2 = "java.version";
		Integer i2 = Integer.getInteger(nm2, 10);
		System.out.println(i2);
		
	}

}

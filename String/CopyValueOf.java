package String;

public class CopyValueOf {
	//�r���}�C���ͦr��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] array  = {'��','��','��','��'};
		String str = String.copyValueOf(array);
		System.out.println(str);
		String str2 = String.copyValueOf(array, 2, 2);
		//�ĤG�Ӧr���}�l����Ӧr��
		System.out.println(str2);
	}

}

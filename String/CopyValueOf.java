package String;

public class CopyValueOf {
	//字元陣列產生字串
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] array  = {'明','日','科','技'};
		String str = String.copyValueOf(array);
		System.out.println(str);
		String str2 = String.copyValueOf(array, 2, 2);
		//第二個字元開始的兩個字元
		System.out.println(str2);
	}

}

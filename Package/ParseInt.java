package Package;

public class ParseInt {
	//將字串解析成int值
	//int parseInt(String s) throws NumverFormatException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stri = "123456";
		int str = Integer.parseInt(stri);
		System.out.println("str字串轉int值："+str);
		String str0[] = {"15","20","25","30"};
		int sum = 0;
		for (int i=0;i<str0.length;i++) {
			int myint = Integer.parseInt(str0[i]);
			sum = sum+=myint;
		}
		System.out.println("str0 陣列中各元素的和為："+sum);
	}

}

package String;

public class SubSequence {
	//獲得子字串序列
	//方法宣告 CharSequence subSequence(int beginIndex, int endIndex);
	//beginIndex:起始索引
	//endIndex:結束索引
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		System.out.println(strCom.subSequence(0,1));
		System.out.println(strCom.subSequence(2,6));
		System.out.println(strCom.subSequence(7,11));
	}

}

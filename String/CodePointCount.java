package String;

public class CodePointCount {
	// 獲得指定範圍文字程式點數(範圍長度)
	// 傳回此String 的指定文字範圍中的Unicode程式點數。文字範圍始於指定的beginIndex，一直到索引endIndex-1處的char。
	// 該文字範圍長度是endIndex-beginIndex。
	// 方法宣告 codePointCount(int beginIndex, int endIndex);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointCount(2, 5);
		System.out.println(str);
	}

}

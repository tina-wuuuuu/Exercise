package String;

public class Replace {
	// 替換字元序列
	// 方法宣告String replace(char oldChar,char newChar)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "桃園圖書館";
		System.out.println("原字串=" + str);
		str = str.replace("桃園", "中壢");
		System.out.println("替換後字串=" + str);
		System.out.println();
		//方法宣告String replace(CharSequence target,CharSequence replacement)
		String str2="nnn";
		str2 = str2.replace("nn", "m");
		System.out.println(str2);
	}

}

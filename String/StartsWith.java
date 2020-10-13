package String;

public class StartsWith {
	//判斷字首字串
	//方法宣告 boolean startsWith(String prefix , int toffset);
	//prefix:字首
	//toffset:字串中開始尋找的位置
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I like Java";
		boolean  str = strCom.startsWith(" ",1);
		System.out.println(str);
	//boolean startsWith(prefix)
		boolean str2 = strCom.startsWith("I");
		System.out.println(str2);
	}

}

package String;

public class ToCharArray {
	//字串變字元陣列
	//方法宣告 char [] toCharArray()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "i like java";
		char [] str = strCom.toCharArray();
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}

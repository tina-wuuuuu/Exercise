package String;

public class CodePointAt {
	//獲得索引字元的程式點(傳回指定值並設定int)
	//傳回指定索引處的字元(Unicode程式點)，索引參考char值(Unicode程式單元)，其範圍為0～
	//使用codePointAt方法獲得字串str索引為8的字元，並將結果值設定給int變數i_str
	//int codePointAt(int index);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointAt(8);
		System.out.println(str);
		
	}
	

}

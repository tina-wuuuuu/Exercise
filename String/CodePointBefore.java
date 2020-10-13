package String;

public class CodePointBefore {
	//獲得索引前一個字元的程式點(傳回指定值之前的字元並設定給int)
	//傳回指定索引之前的字元(Unicode程式點)，索引參考char值(Unicode程式點)，其範圍為1～字串長度
	//int codePointBefore(in index);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int str = strCom.codePointBefore(8);
		System.out.print(str);
	}

}

package String;

public class IndexOf {
//獲得字元第一個索引
	//方法宣告 int indexOf(int ch);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA 9";
		int index = strCom.indexOf(5);
		int index2 = strCom.indexOf("JAVA");
		int index3 = strCom.indexOf(9);
		int index4 = strCom.indexOf("9");
		System.out.println(index);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);
		System.out.println();
	//方法宣告 int intdexOf(int ch,int fromIndex);
		//ch:一個字元
		//fromIndex:開始搜尋的位置
		String strCom2 = "123456789";
		int index_0 = strCom.indexOf(9, 0);
		int index_1 = strCom.indexOf("9", 0);
		int index_2 = strCom2.indexOf(8, 0);
		int index_3 = strCom2.indexOf("8", 0);
		int index_4 = strCom2.indexOf("2", 0);
		int index_5 = strCom2.indexOf("2", 2);
		System.out.println(index_0);
		System.out.println(index_1);
		System.out.println(index_2);
		System.out.println(index_3);
		System.out.println(index_4);
		System.out.println(index_5);
		System.out.println();
	//方法宣告:int intdexOf(String str);
		String strCom3 = "明日科技有限公司";
		int index_st = strCom3.indexOf("明日科技");
		System.out.println(index_st);
		int index_st1 = strCom3.indexOf("公司");
		System.out.println(index_st1);
		System.out.println();
	//方法宣告:int indexOf(String str,int fromIndex);
		//str:要搜尋的子字串
		//fromIndex:開始搜索的索引位置
		int index_sf = strCom3.indexOf("明日科技", 5);
		int index_sf2 = strCom3.indexOf("公司", 5);
		System.out.println(index_sf);
		System.out.println(index_sf2);

	}

}

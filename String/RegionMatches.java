package String;

public class RegionMatches {
//測試兩個字串區域是否相等
	// 方法宣告 boolean regionMatches(boolean ignoreCase, int toffset, String other, int
	// ooffser, int len)
	// ignoreCase:如果為true，比較字元時忽略大小寫
	// toffset:字串中子區域的起始偏移量
	// other:字串參數
	// ooffset:字串參數中子區域的起始偏移量
	// len:要比較的字元數
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "ABLIKE";
		String strCom2 = "CDlike";
		// 比較兩字串
		boolean a = strCom.regionMatches(true, 2, strCom2, 0, 2);
		System.out.println(a);
		boolean a1 = strCom.regionMatches(false, 2, strCom2, 2, 4);
		//ignoreCase值false結果就false
		System.out.println(a1);
		boolean b = strCom.regionMatches(true, 2, strCom2, 2, 4);
		System.out.println(b);
		boolean c = strCom.regionMatches(true, 2, strCom2, 2, 5);
		//len:5超過字串長度結果false
		System.out.println(c);
		boolean d  = strCom.regionMatches(true, -2, strCom2, 2, 5);
		//toffset.ooffset其中有一值為負結果false
		System.out.println(d);
		System.out.println();
		String strCom3 = "CDLIKE";
		boolean b2 = strCom.regionMatches(true, 2, strCom3, 2, 4);
		//直接比較，不忽略大小寫
		System.out.println(b2);
		boolean a2 = strCom.regionMatches(true, 2, strCom3, 0, 2);
		System.out.println(a2);

	}

}

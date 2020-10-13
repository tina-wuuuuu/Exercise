package String;

public class OffsetByCodePoints {
//獲得索引偏移後指定程式點的索引
	//int offsetByCodePoints(int index,int codePointOffset)
	//index:要偏移的索引
	//CodePointOffset:程式點中的偏移量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		int i = strCom.offsetByCodePoints(2, 3);//從索引2偏移3個程式點的索引，輸出為5
		System.out.println(i);
	}

}

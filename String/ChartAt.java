package String;

public class ChartAt {
	//分析指定字元(傳回指定值)
	//該方法傳回指定位置的char值，索引範圍0～
	//方法宣告 char charAt(int index);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		char str = strCom.charAt(4);
		System.out.println(str);
		
		String strCom2 = "明日科技";
		char str2 = strCom2.charAt(2);
		System.out.println(str2);

	}

}

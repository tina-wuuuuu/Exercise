package String;

public class ReplaceFirst {
	//正式表示法替換第一個比對的字蔡
	//String replaceFirst()String regex,String replacement)
	//regex:用來比對的正式表示法
	//replacement:用來替換第一個比對項的字串
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="桃園圖書館，桃園火車站，桃園夜市";
		str = str.replaceFirst("桃園", "中壢");
		System.out.println(str);
	}

}

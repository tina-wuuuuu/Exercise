package String;

public class Compare_to {
	//比較兩個字串
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		String strCom2 = "I LIKE PHP";
		int str = strCom.compareTo(strCom2);
		System.out.println(str);
		//由於str1.str2從第六個字元開始不同，字元P排序在J之後(-6)，所以字串傳回值-6
		String strCom3 = "I LIKE JAVA";
		String strCom4 = "I LIKE php";
		int str2 = strCom3.compareTo(strCom4);
		System.out.println(str2);
		//大小寫差-32在加，字元p排序在j之後的-6=-38
	}

}

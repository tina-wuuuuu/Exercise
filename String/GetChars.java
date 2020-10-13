package String;

public class GetChars {
//獲得字元陣列
	//getChars(int srcBegin,int srcEnd,char []dst,int dstBegin);
	//srcBegin:字串中要複製的第一個字元
	//srcEnd:字串中要複製的最後一個字元
	//dst:目標陣列
	//dstBegin:目標陣列中的起始偏移量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "I LIKE JAVA";
		char [] dst = new char [10];
		strCom.getChars(0, 11, dst, 0);
		for(int i =0 ; i < dst.length ; i++ ) {
			System.out.println(dst[i]);
		}
	}

}

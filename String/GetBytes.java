package String;

import java.io.UnsupportedEncodingException;

public class GetBytes {
//獲得字串的位元組陣列
	//方法宣告 byte [] getBytes(Charset charset);
	//byte [] getBytes(String charsetName);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "java";
		
		byte [] str = strCom.getBytes();//將指定字串編碼為byte序列
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);//輸出傳回陣列
		}
		
		
		System.out.println();
		
		
		byte [] str2;
		try{
			str2 = strCom.getBytes("GBK");
			for(int j=0;j<str2.length;j++) {
				System.out.println(str2[j]);
			}
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		
	}

}

package String;

import java.io.UnsupportedEncodingException;

public class GetBytes {
//��o�r�ꪺ�줸�հ}�C
	//��k�ŧi byte [] getBytes(Charset charset);
	//byte [] getBytes(String charsetName);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCom = "java";
		
		byte [] str = strCom.getBytes();//�N���w�r��s�X��byte�ǦC
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);//��X�Ǧ^�}�C
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

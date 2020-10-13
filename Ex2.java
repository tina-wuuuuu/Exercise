package Date0708;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判斷大小寫字串
		System.out.println("請輸入");
		Scanner console = new Scanner(System.in);
		String Str =console.nextLine();
		StringBuilder upperStr= new StringBuilder();
		StringBuilder lowerStr= new StringBuilder();
		int i =0;
		while(i<Str.length()){
			char chr =Str.charAt(i);
			if (Character.isUpperCase(chr)) {
				upperStr.append(chr);
			}else if(Character.isLowerCase(chr)) {
				lowerStr.append(chr);
			}
			i++;
		}
		System.out.println("大寫字母有:"+ upperStr.toString());
		System.out.println("小寫字母有:"+ lowerStr.toString());
		console.close();
	}
	

}

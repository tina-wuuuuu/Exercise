package Date0708;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�P�_�j�p�g�r��
		System.out.println("�п�J");
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
		System.out.println("�j�g�r����:"+ upperStr.toString());
		System.out.println("�p�g�r����:"+ lowerStr.toString());
		console.close();
	}
	

}
